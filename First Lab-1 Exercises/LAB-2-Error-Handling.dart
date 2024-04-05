// Function to divide two numbers
double divideNumbers(double dividend, double divisor) {
  if (divisor == 0) {
    throw IntegerDivisionByZeroException();
  }
  return dividend / divisor;
}

void main() {
  double a = 10;
  double b = 0;
  
  try {
    double result = divideNumbers(a, b);
    print('Result of division: $result');
  } catch (e) {
    print('Error: Division by zero');
  }
}
