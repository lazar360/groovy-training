// def est inséré par défaut si rien est précisé
age = 77
phrase = 'le capitaine a ' + age + ' ans.'
print 'Test def par defaut\n'
print '------\n'
println phrase
println '\nTest typage dynamique'
println '-----------------------'
def film = "Mon nom est personne."
def nbVision = 7
println "J'ai vu $nbVision fois le $film."
println '\nTest typage Java'
println '-----------------------'
String film2 = 'La ligne verte';
int nbVision2 = 2;
println "J'ai vu $nbVision2 fois le $film2."
println "Test declaration constante"
println '-----------------------'
// en majuscules la constante a un champ large, avec final, elle a un champ restreint à la classe
// certains préconisent de la créer static final dans une classe à part 
MYCONSTANT = "ma constante"
println MYCONSTANT




