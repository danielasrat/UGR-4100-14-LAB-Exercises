fun main() {
    // Task 1: Sum of all even numbers from 1 to 50 using a for loop
    var sum = 0
    for (i in 2..50 step 2) {
        sum += i
    }
    println("Sum of even numbers from 1 to 50: $sum")

    // Task 2: Finding prime numbers within a given range using a while loop
    val start = 10
    val end = 50
    println("Prime numbers between $start and $end are:")
    var num = start
    while (num <= end) {
        if (isPrime(num))
            println(num)
        num++
    }

    // Task 3: Checking if a given number is a palindrome using a while loop
    val number = 12321
    if (isPalindrome(number)) {
        println("$number is a palindrome")
    } else {
        println("$number is not a palindrome")
    }
}

// Helper function to check if a number is prime
fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    var i = 2
    while (i * i <= n) {
        if (n % i == 0) {
            return false
        }
        i++
    }
    return true
}

// Helper function to check if a number is a palindrome
fun isPalindrome(number: Int): Boolean {
    var num = number
    var reversed = 0
    var original = num

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    return original == reversed
}
