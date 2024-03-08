// Exercise 2
void main() {
  // Checking for prime numbers within the range of 1 to 20
  for (int i = 1; i <= 20; i++) {
    if (isPrime(i)) {
      print('$i is prime');
    }
  }
}

// Function to check if a number is prime
bool isPrime(int number) {
  if (number <= 1) {
    return false;
  }
  for (int i = 2; i <= number / 2; i++) {
    if (number % i == 0) {
      return false;
    }
  }
  return true;
}
