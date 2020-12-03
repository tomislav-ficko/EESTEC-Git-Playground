fun main(args: Array<String>) {
    val example = KotlinExample()

    println(example.getResponse())
}

class KotlinExample {
    fun getResponse() : String {
        return "EESTEC, what's your profession???"
    }
}