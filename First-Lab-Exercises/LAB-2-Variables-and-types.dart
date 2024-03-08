// LAB-1-Exercise-2.dart
import 'dart:io';

void main() {
  // Exercise 2
  const int SPEED_OF_LIGHT = 299792458; // meters per second

  // Taking distance as input from user
  print("Enter the distance in meters: ");
  String userInput = stdin.readLineSync()!;
  double distance = double.parse(userInput);

  double time = distance / SPEED_OF_LIGHT;

  print("It takes light approximately ${time.toStringAsFixed(9)} seconds to travel $distance meters.");
}
