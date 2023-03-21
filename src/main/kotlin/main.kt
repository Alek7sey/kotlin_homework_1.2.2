fun main() {
    identifyPeople(1)
    identifyPeople(2)
    identifyPeople(7)
    identifyPeople(10)
    identifyPeople(11)
    identifyPeople(32)
    identifyPeople(61)
}

fun identifyPeople(likes: Int) {
    if (likes == 1 || (likes > 11 && likes % 10 == 1)) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}