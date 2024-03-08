// Exercise 1
void main() {
  List<String> hobbies = ['reading', 'playing guitar', 'hiking'];
  
  print('Initial hobbies: $hobbies');
  
  // Adding a hobby
  hobbies.add('cooking');
  print('After adding a hobby: $hobbies');
  
  // Removing a hobby
  hobbies.remove('playing guitar');
  print('After removing a hobby: $hobbies');
  
  // Sorting hobbies
  hobbies.sort();
  print('After sorting hobbies: $hobbies');
  
  // Checking if the list is empty
  print('Is the list empty? ${hobbies.isEmpty}');
}
