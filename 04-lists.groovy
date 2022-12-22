//Declaration d'une liste
def liste = ["banane", "raisin", "pomme", "poire"]

// Afficher la taille de la liste
println(liste.size)
print(liste[1])//afficher raisin

// Declaration d'une map
def departement = [ "Ain":01, "Vosges":"88", "Rhône Alpes":69 ]
// accès à map
println departement.Vosges
println departement["Rhône Alpes"]

//Parcourir la liste
liste.each{
    println it
}

// Creer des listes vides et ajouter des elements
maMap = [:]
maListe = []
// Ajouter des elements
maMap.put("TOTO",44)
maListe.add("TATA")
println maMap["TOTO"]
println maListe[0]

// ou 
maListe << "TITI"
maListe + "TOTO"
maListe.each{
    println it
}