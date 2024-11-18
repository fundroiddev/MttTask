package task2

fun main() {

    val clothRoute = Route(Product.CLOTH)
    val foodRoute = Route(Product.FOOD)
    val fuelRoute = Route(Product.FUEL)

    val fleet = listOf(
        Ship(clothRoute, "Петр Великий", 40),
        Ship(clothRoute, "Екатерина Великая", 40),
        Ship(foodRoute, "Александр Невский", 60),
        Ship(foodRoute, "Александр Кузнецов", 50),
        Ship(fuelRoute, "Александр Суворов", 70),
        Ship(fuelRoute, "Иван Грозный", 60),
    )

    fleet.forEach { Thread(it).start() }
}
