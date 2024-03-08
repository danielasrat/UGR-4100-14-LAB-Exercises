// Exercise 2
class Product {
  String name;
  double price;
  int quantity;

  // Constructor
  Product(this.name, this.price, this.quantity);

  // Method to calculate total cost
  double calculateTotalCost() {
    return price * quantity;
  }
}

void main() {
  // Creating a product object
  var product = Product('Phone', 500.0, 2);

  // Calculating and printing total cost
  print('Total Cost: ${product.calculateTotalCost()}');
}
