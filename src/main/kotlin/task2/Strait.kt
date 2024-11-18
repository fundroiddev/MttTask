package task2

class Strait(length: Int) : Stage(length, "Пролив длинной $length") {

    override fun passThrough(name: String, speed: Int) {
        println("$name начал проплывать $description")
        Thread.sleep((length / speed * 1000).toLong())
        println("$name проплыл $description")
    }
}