package task1

fun main() {
    val forks = List(5) { i -> Fork(i.toString()) }
    val philosophers = List(5) { i -> Thread(Philosopher(i.toString(), forks[i], forks[(i + 1) % 5])) }

    philosophers.forEach { it.start() }
    philosophers.forEach { it.join() }
}