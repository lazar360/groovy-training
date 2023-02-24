//Tester la présence d'une chaîne 
if("Introduction au langage groovy" =~ "langage"){
    println"langage est dans la phrase"
}

//Remplacer une chaîne de caractère
def phrase = ("Introduction au langage Groovy" =~ /Introduction au/).replaceFirst("Tutoriel sur le")
println phrase

//Trouver un texte
def liste = "tokenUN TEXTE A TROUVERtoken" =~ /token(.*)token/
println liste[0][1]