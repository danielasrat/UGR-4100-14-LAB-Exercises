// Exercise 2
class Person {
  String name;
  int age;
  String address;

  // Constructor
  Person(this.name, this.age, this.address);
}

class Student extends Person {
  int rollNumber;
  List<int> marks;

  // Constructor
  Student(String name, int age, String address, this.rollNumber, this.marks)
      : super(name, age, address);

  // Method to calculate total marks
  int calculateTotalMarks() {
    return marks.reduce((value, element) => value + element);
  }

  // Method to calculate average marks
  double calculateAverageMarks() {
    return calculateTotalMarks() / marks.length;
  }
}

void main() {
  // Creating student objects
  var student1 = Student('John', 20, '123 Main St', 101, [85, 90, 95, 80, 88]);
  var student2 = Student('Alice', 22, '456 Elm St', 102, [78, 88, 92, 85, 90]);

  // Accessing attributes
  print('Student 1 - Name: ${student1.name}, Age: ${student1.age}, Address: ${student1.address}, Roll Number: ${student1.rollNumber}');
  print('Student 2 - Name: ${student2.name}, Age: ${student2.age}, Address: ${student2.address}, Roll Number: ${student2.rollNumber}');

  // Calculating total marks and average marks
  print('Student 1 - Total Marks: ${student1.calculateTotalMarks()}, Average Marks: ${student1.calculateAverageMarks()}');
  print('Student 2 - Total Marks: ${student2.calculateTotalMarks()}, Average Marks: ${student2.calculateAverageMarks()}');
}
