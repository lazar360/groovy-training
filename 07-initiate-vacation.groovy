import org.bonitasoft.engine.api.IdentityAPI
import org.bonitasoft.engine.identity.User
import org.bonitasoft.engine.identity.UserCriterion

import com.company.model.VacationAvailable

// Default vacations days number
final int daysAvailableInitialValue = 10

// Offset and increment to use when using paginated API
int offset = 0
int increment = 10

// The list of Bonita BPM user id that already have an entry in VacationAvailable table
List<Long> alreadyKnownEmployeeId = new ArrayList<Long>()

// The list of already created VacationAvailaible
List<VacationAvailable> currentlyExistingVacationAvailable

// The newly created VacationAvailable
List<VacationAvailable> newVacationAvailable = new ArrayList<VacationAvailable>()

// Search for already existing VacationAvailable counters
while ((currentlyExistingVacationAvailable = vacationAvailableDAO.find(offset, increment)).size() > 0) {
	for (VacationAvailable va : currentlyExistingVacationAvailable) {
		// Update the list of user ids for user who already have an associated VacationAvailable object
		alreadyKnownEmployeeId.add(va.bonitaBPMId)
		
		// Reset the vacation available counter
		va.daysAvailableCounter = daysAvailableInitialValue
	}

	offset += increment
}

IdentityAPI identityAPI = apiAccessor.identityAPI

List<User> users

offset = 0

// For each user
while (((users = identityAPI.getUsers(offset, increment, UserCriterion.USER_NAME_ASC)).size()) > 0) {

	for(User user : users) {

		// If user doesn't already have an associated VacationAvailable object
		if(alreadyKnownEmployeeId.contains(user.id) == false) {
			// Create the object and set the default counter value

			VacationAvailable va = new VacationAvailable()
			va.bonitaBPMId = user.id
			va.daysAvailableCounter = daysAvailableInitialValue
			newVacationAvailable.add(va)
		}
	}
	
	offset += increment
}
	
return newVacationAvailable