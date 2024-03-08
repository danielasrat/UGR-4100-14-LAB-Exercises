// Exercise 1
class Rectangle {
  double width;
  double height;

  // Constructor
  Rectangle(this.width, this.height);

  // Method to calculate area
  double calculateArea() {
    return width * height;
  }

  // Method to calculate perimeter
  double calculatePerimeter() {
    return 2 * (width + height);
  }
}

void main() {
  // Creating a rectangle object
  var rectangle = Rectangle(5.0, 3.0);

  // Calculating and printing area and perimeter
  print('Area: ${rectangle.calculateArea()}');
  print('Perimeter: ${rectangle.calculatePerimeter()}');
}
