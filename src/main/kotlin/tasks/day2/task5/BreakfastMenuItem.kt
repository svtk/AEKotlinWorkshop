package tasks.day2.task5

/*
 * Uncomment the following code and make it compile.
 * Define function 'breakfastMenu' and 'item' so that
 * it was possible to use the following way to create
 * the BreakfastMenu item.
 */

fun buildMenu(): BreakfastMenu = TODO() /*breakfastMenu {
    item(
        name = "Belgian Waffles",
        price = 5.95,
        calories = 650
    )
    item(
        name = "Strawberry Belgian Waffles",
        price = 7.95,
        calories = 900
    )
    item(
        name = "Berry-Berry Belgian Waffles",
        price = 8.95,
        calories = 900
    )
    item(
        name = "French Toast",
        price = 4.5,
        calories = 600
    )
    item(
        name = "Homestyle Breakfast",
        price = 6.95,
        calories = 950
    )
}*/

fun main() {
    println(buildMenu())
}

data class BreakfastMenu(
    val items: List<BreakfastMenuItem>
)

data class BreakfastMenuItem(
    val name: String,
    val price: Double,
    val calories: Int
)