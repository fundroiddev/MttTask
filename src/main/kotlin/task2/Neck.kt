package task2

import java.util.concurrent.Semaphore

class Neck(length: Int): Stage(length, "Перешеек длиной $length") {

    private val nsp = Semaphore(2)

    override fun passThrough(name: String, speed: Int) {
        println("$name готовится переплыть перешеек $description")
        nsp.acquire()
        println("$name переплывает $description")
        Thread.sleep((length / speed * 1000).toLong())
        println("$name переплыл $description")
        nsp.release()
    }
}

