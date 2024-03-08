// Exercise 4
class Product {
  String name;
  double price;
  int quantity;
  
  Product(this.name, this.price, this.quantity);
}

void main() {
  List<Product> cart = [];
  
  // Adding items to cart
  cart.add(Product('Phone', 500.0, 1));
  cart.add(Product('Laptop', 1000.0, 2));
  
  // Calculating total price
  double totalPrice = 0;
  for (var product in cart) {
    totalPrice += product.price * product.quantity;
  }
  print('Total price: $totalPrice');
  
  // Removing an item from cart
  cart.removeWhere((product) => product.name == 'Laptop');
  print('After removing Laptop: $cart');
}
