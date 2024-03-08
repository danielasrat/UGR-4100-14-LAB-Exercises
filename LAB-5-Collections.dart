// Exercise 5
class Student {
  String name;
  List<int> marks;
  
  Student(this.name, this.marks);
  
  double calculateAverageMark() {
    if (marks.isEmpty) return 0;
    return marks.reduce((value, element) => value + element) / marks.length;
  }
}

void main() {
  var student = Student('Alice', [85, 90, 80]);
  print('Average mark for ${student.name}: ${student.calculateAverageMark()}');
}
