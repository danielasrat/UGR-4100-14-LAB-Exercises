// Exercise 3
void main() {
  String originalString = "hello";

  // Call the function and print the result
  print(reverseString(originalString));
}

// Function to reverse a string
String reverseString(String str) {
  String reversed = '';
  for (int i = str.length - 1; i >= 0; i--) {
    reversed += str[i];
  }
  return reversed;
}
