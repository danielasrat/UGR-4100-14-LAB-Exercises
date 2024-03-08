// Exercise 3
void main() {
  Map<String, int> studentMarks = {
    'Alice': 85,
    'Bob': 90,
    'Charlie': 75
  };
  
  // Adding a new entry
  studentMarks.putIfAbsent('David', () => 80);
  
  // Iterating over entries
  studentMarks.forEach((name, marks) {
    print('$name: $marks');
  });
  
  // Checking if an entry exists
  print('Does Alice exist? ${studentMarks.containsKey('Alice')}');
}
