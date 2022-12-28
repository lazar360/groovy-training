//closure simple hello world
println"1- closure hello world"
println"--------------------------"
helloWorld = {String nom, String profession -> println"Hello $nom, ta profession est $profession"}
helloWorld("Nicolas", "developpeur")
print"\n"
//closure afficher un tableau
println"2- closure afficher un tableau"
println"--------------------------"
affiche = {value -> println(value)}
affiche(['a', 'b', 'c'])
print"\n"

//closure avec curry (application partielle de la closure)
println"3-closure avec curry (application partielle de la closure)"
println"--------------------------"
def c = { arg1, arg2 -> println "${arg1} ${arg2}" }
def d = c.curry("Ici")
d("Zebra 3")
print"\n"

//trouver un prenom de moins de 3 lettres dans une liste
println"4-trouver un prenom de moins de 3 lettres dans une liste"
println"--------------------------"
trouvepetit = {liste->  liste.findAll { it.size() < 4 }.each { println it } }
trouvepetit(["Eric", "Jean-Claude", "Paul-Edouard","Luc"])
