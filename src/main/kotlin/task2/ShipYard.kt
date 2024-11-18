package task2

import java.util.concurrent.Semaphore

class ShipYard(private val product: Product) : Stage(0, "Порт к загрузке") {

    private val sysp = Semaphore(1)

    override fun passThrough(name: String, speed: Int) {
        println("$description ${product.productName} готовится $name")
        sysp.acquire()
        println("$name загружается ${product.productName}")
        Thread.sleep(500)
        println("$$name загружен ${product.productName}")
        sysp.release()
    }
}