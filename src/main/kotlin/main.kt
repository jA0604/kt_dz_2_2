fun main() {
    val likes = 11
    var people = "человекам"

    if (likes == 1) people = "человеку"
    else if (likes == 2 || likes == 3 ) people = "людям"

    println("Нравится $likes $people")
}