package task2

class Route(product: Product) {

    val stages: List<Stage>
    val bay: Bay = Bay(product)

    init {
        stages = listOf(
            Strait(100),
            Neck(50),
            ShipYard(product),
            Neck(50),
            Strait(100),
            bay
        )
    }
}