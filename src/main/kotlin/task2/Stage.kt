package task2

abstract class Stage(val length: Int, val description: String) {

    abstract fun passThrough(name: String, speed: Int)
}