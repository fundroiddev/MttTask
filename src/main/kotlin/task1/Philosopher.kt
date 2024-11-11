package task1

class Philosopher(private val id: String, private val leftFork: Fork, private val rightFork: Fork) : Runnable {

    private fun eat() {
        println("Философ $id ест")
        Thread.sleep((500..1000).random().toLong())
    }

    private fun think() {
        println("Философ $id думает")
        Thread.sleep((500..1000).random().toLong())
    }

    override fun run() {
        while (true) {
            think()
            synchronized(leftFork) {
                synchronized(rightFork) {
                    println("Философ $id взял левую вилку ${leftFork.id}")
                    println("Философ $id взял правую вилку ${rightFork.id}")

                    eat()

                    println("Философ $id положил левую вилку ${leftFork.id}")
                    println("Философ $id положил правую вилку ${rightFork.id}")
                }
            }
        }
    }
}