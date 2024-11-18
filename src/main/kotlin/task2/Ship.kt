package task2

class Ship(private val route: Route, private val name: String, private val speed: Int) : Runnable {

    override fun run() {
        val bay = route.bay
        while (route.bay.product.volume > bay.produce) {
            println("$name готовится к отплытию")
            Thread.sleep((Math.random() * 500).toLong())
            println("$name готов")

            for (stage in route.stages) {
                stage.passThrough(name, speed)
            }
        }
        println("Склад заполнен")
    }

    companion object {
        const val CAPACITY = 500
    }
}