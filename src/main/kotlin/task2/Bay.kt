package task2

import java.util.concurrent.Semaphore

class Bay(val product: Product): Stage(0, "Порт со складами ${product.productName}") {

    var produce = 0
    private val bsp = Semaphore(1)

    override fun passThrough(name: String, speed: Int) {
        if (product.volume > produce) {
            println("$name готовится к разгрузке в $description")
            bsp.acquire()
            println("$name разгружается в $description")
            Thread.sleep(500)
            produce += Ship.CAPACITY
            println("$name закончил разгрузку. $description содержит $produce ${product.productName}")
            bsp.release()
        } else {
            println("Склады заполнены ${product.productName}")
        }
    }
}