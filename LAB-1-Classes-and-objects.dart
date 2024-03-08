// Exercise 1
class Person {
  String name;
  int age;
  String address;

  // Constructor
  Person(this.name, this.age, this.address);
}

void main() {
  // Creating objects of Person class
  var person1 = Person('John', 25, '123 Main St');
  var person2 = Person('Alice', 30, '456 Elm St');

  // Accessing attributes
  print('Person 1 - Name: ${person1.name}, Age: ${person1.age}, Address: ${person1.address}');
  print('Person 2 - Name: ${person2.name}, Age: ${person2.age}, Address: ${person2.address}');

  // Modifying attributes
  person1.age = 26;
  person2.address = '789 Oak St';

  // Printing modified attributes
  print('Person 1 - Name: ${person1.name}, Age: ${person1.age}, Address: ${person1.address}');
  print('Person 2 - Name: ${person2.name}, Age: ${person2.age}, Address: ${person2.address}');
}
