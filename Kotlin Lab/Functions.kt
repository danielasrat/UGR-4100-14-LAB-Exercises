class Main {
    // Function to sort an array of integers in ascending order
    fun sortArray(arr: IntArray): IntArray {
        arr.sort()
        return arr
    }

    // Function to calculate the factorial of a given number using recursion
    fun factorial(n: Int): Long {
        return when {
            n == 0 || n == 1 -> 1
            else -> n * factorial(n - 1)
        }
    }

    // Function to check if a given string contains only unique characters
    fun hasUniqueCharacters(str: String): Boolean {
        val charSet = mutableSetOf<Char>()
        for (char in str) {
            if (!charSet.add(char)) {
                return false
            }
        }
        return true
    }

    // Main function to test the implemented functions
    fun main() {
        // Test sorting an array
        val array = intArrayOf(5, 2, 7, 1, 3)
        val sortedArray = sortArray(array)
        println("Sorted Array: ${sortedArray.joinToString()}")

        // Test calculating factorial
        val number = 5
        val result = factorial(number)
        println("Factorial of $number = $result")

        // Test checking unique characters in a string
        val str1 = "abcdefg"
        val str2 = "hello"

        println("String $str1 has unique characters: ${hasUniqueCharacters(str1)}")
        println("String $str2 has unique characters: ${hasUniqueCharacters(str2)}")
    }
}

// Entry point of the program
fun main() {
    val main = Main()
    main.main()
}
