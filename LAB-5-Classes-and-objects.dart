// Exercise 3
import 'dart:math';

// Abstract class Shape
abstract class Shape {
  // Abstract method
  double calculateArea();
}

// Circle subclass
class Circle extends Shape {
  double radius;

  // Constructor
  Circle(this.radius);

  // Implementation of abstract method
  @override
  double calculateArea() {
    return pi * radius * radius;
  }
}

// Square subclass
class Square extends Shape {
  double side;

  // Constructor
  Square(this.side);

  // Implementation of abstract method
  @override
  double calculateArea() {
    return side * side;
  }
}

void main() {
  // Creating circle and square objects
  var circle = Circle(5.0);
  var square = Square(4.0);

  // Calculating and printing area of circle and square
  print('Area of Circle: ${circle.calculateArea()}');
  print('Area of Square: ${square.calculateArea()}');
}
