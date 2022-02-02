fun main() {

    val likes = 11

    println("Понравилось $likes ${likesSinglePlay(likes)}")
}

fun likesSinglePlay(likes: Int): String {
    return if (likes % 10 == 1 && likes % 100 !== 11) {
        return "человеку"
    } else {
        return "людям"
    }
}