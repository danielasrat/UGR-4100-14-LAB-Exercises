// Exercise 2
import 'dart:math';

void main() {
  List<int> randomNumbers = List.generate(10, (_) => Random().nextInt(10));
  
  print('Random numbers: $randomNumbers');
  
  Set<int> uniqueNumbers = randomNumbers.toSet();
  
  print('Unique numbers: $uniqueNumbers');
}
