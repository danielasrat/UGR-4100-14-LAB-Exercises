fun main() {
    // Function to determine the type of triangle
    fun determineTriangleType(a: Double, b: Double, c: Double): String {
        return when {
            a == b && b == c -> "Equilateral"
            a == b || b == c || a == c -> "Isosceles"
            else -> "Scalene"
        }
    }

    // Function to calculate total salary with overtime
    fun calculateTotalSalary(hours: Double, rate: Double): Double {
        val regularHours = if (hours > 40) 40.0 else hours
        val overtimeHours = if (hours > 40) hours - 40 else 0.0
        val overtimeRate = rate * 1.5
        return (regularHours * rate) + (overtimeHours * overtimeRate)
    }

    // Function to determine the season based on month and day
    fun determineSeason(month: Int, day: Int): String {
        return when (month) {
            1, 2 -> "Winter"
            3 -> if (day < 20) "Winter" else "Spring"
            4, 5 -> "Spring"
            6 -> if (day < 21) "Spring" else "Summer"
            7, 8 -> "Summer"
            9 -> if (day < 22) "Summer" else "Fall"
            10, 11 -> "Fall"
            12 -> if (day < 21) "Fall" else "Winter"
            else -> "Invalid month"
        }
    }

    // Function to find the largest among three numbers using nested conditionals
    fun findLargest(a: Int, b: Int, c: Int): Int {
        return if (a > b) {
            if (a > c) a else c
        } else {
            if (b > c) b else c
        }
    }

    // Example usage

    // Triangle Type
    println("Enter the lengths of the three sides of the triangle:")
    val side1 = readLine()!!.toDoubleOrNull() ?: 0.0
    val side2 = readLine()!!.toDoubleOrNull() ?: 0.0
    val side3 = readLine()!!.toDoubleOrNull() ?: 0.0
    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
        println("The triangle is ${determineTriangleType(side1, side2, side3)}")
    } else {
        println("The entered sides do not form a valid triangle")
    }

    // Total Salary with Overtime
    println("Enter the number of hours worked:")
    val hoursWorked = readLine()!!.toDoubleOrNull() ?: 0.0
    println("Enter the hourly rate:")
    val hourlyRate = readLine()!!.toDoubleOrNull() ?: 0.0
    val totalSalary = calculateTotalSalary(hoursWorked, hourlyRate)
    println("The total salary is: $$totalSalary")

    // Determine Season
    println("Enter the month (1-12):")
    val month = readLine()!!.toIntOrNull() ?: 0
    println("Enter the day (1-31):")
    val day = readLine()!!.toIntOrNull() ?: 0
    if (month in 1..12 && day in 1..31) {
        println("The season is ${determineSeason(month, day)}")
    } else {
        println("Invalid month or day")
    }

    // Find Largest Number
    println("Enter three different numbers:")
    val num1 = readLine()!!.toIntOrNull() ?: 0
    val num2 = readLine()!!.toIntOrNull() ?: 0
    val num3 = readLine()!!.toIntOrNull() ?: 0
    println("The largest number is ${findLargest(num1, num2, num3)}")
}
