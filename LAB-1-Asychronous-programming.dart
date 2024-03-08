import 'dart:async';
import 'dart:math';

// Function to simulate a network call and return a random quote after a delay
Future<String> fetchQuote() async {
  await Future.delayed(Duration(seconds: 2)); // Simulating delay
  List<String> quotes = [
    "The only way to do great work is to love what you do. - Steve Jobs",
    "Life is what happens when you're busy making other plans. - John Lennon",
    "In the end, it's not the years in your life that count. It's the life in your years. - Abraham Lincoln"
  ];
  return quotes[Random().nextInt(quotes.length)];
}

void main() async {
  // Wait for the quote to be fetched asynchronously
  var quote = await fetchQuote();
  print(quote);
}
