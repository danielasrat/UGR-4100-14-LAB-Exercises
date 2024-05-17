import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    // Declaring and assigning a value to the variable currentTime
    val currentTime: String = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
    println("Current Time: $currentTime")
    
    // Declaring and assigning a value to the variable temperature
    val temperature: Double = 25.5
    println("Temperature: $temperature°C")
    
    // Declaring and assigning a value to the variable grade
    val grade: Char = 'A'
    println("Grade: $grade")
}
