class Rectangle(val length: Double, val width: Double) {
    // Method to calculate perimeter
    fun calculatePerimeter(): Double {
        return 2 * (length + width)
    }

    // Method to calculate area
    fun calculateArea(): Double {
        return length * width
    }
}

class Triangle(val side1: Double, val side2: Double, val side3: Double) {
    // Method to determine the type of triangle
    fun triangleType(): String {
        return when {
            side1 == side2 && side2 == side3 -> "Equilateral"
            side1 == side2 || side1 == side3 || side2 == side3 -> "Isosceles"
            else -> "Scalene"
        }
    }
}

class ShoppingCart {
    private val items = mutableMapOf<String, Double>()

    // Method to add an item with its price
    fun addItem(itemName: String, price: Double) {
        items[itemName] = price
    }

    // Method to remove an item
    fun removeItem(itemName: String) {
        items.remove(itemName)
    }

    // Method to calculate total price
    fun calculateTotalPrice(): Double {
        var total = 0.0
        items.values.forEach { price -> total += price }
        return total
    }
}

fun main() {
    // Rectangle example
    val rectangle = Rectangle(5.0, 3.0)
    println("Rectangle Perimeter: ${rectangle.calculatePerimeter()}")
    println("Rectangle Area: ${rectangle.calculateArea()}")

    // Triangle example
    val triangle1 = Triangle(5.0, 5.0, 5.0)
    println("Triangle 1 type: ${triangle1.triangleType()}")  // Equilateral

    val triangle2 = Triangle(5.0, 5.0, 3.0)
    println("Triangle 2 type: ${triangle2.triangleType()}")  // Isosceles

    val triangle3 = Triangle(3.0, 4.0, 6.0)
    println("Triangle 3 type: ${triangle3.triangleType()}")  // Scalene

    // ShoppingCart example
    val cart = ShoppingCart()
    cart.addItem("Laptop", 1500.0)
    cart.addItem("Mouse", 25.0)
    cart.addItem("Keyboard", 100.0)

    println("Total Price: ${cart.calculateTotalPrice()}")

    cart.removeItem("Mouse")

    println("Updated Total Price after removing Mouse: ${cart.calculateTotalPrice()}")
}
