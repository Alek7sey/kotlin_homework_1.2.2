import kotlin.math.pow

fun main() {
    identifyPeople(1)
    identifyPeople(7)
    identifyPeople(11)
    identifyPeople(32)
    identifyPeople(61)
    identifyPeople(111)
    identifyPeople(121)
    identifyPeople(1011)
    identifyPeople(10011)
    identifyPeople(10021)
    identifyPeople(100062)
}

fun identifyPeople(likes: Int) {
    val length = likes.toString().length
    if (likes != 11 && (likes % 10.toFloat().pow((length - 1)).toInt()) != 11 && likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}