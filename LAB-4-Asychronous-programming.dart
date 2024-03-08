import 'dart:convert';
import 'package:http/http.dart' as http;

// Function to fetch weather data from an API asynchronously
Future<void> fetchWeatherData() async {
  var apiKey = 'YOUR_API_KEY'; // Replace with actual API key
  var city = 'New York'; // Replace with desired city
  var url = 'http://api.openweathermap.org/data/2.5/weather?q=$city&appid=$apiKey';
  
  var response = await http.get(Uri.parse(url));
  if (response.statusCode == 200) {
    var data = jsonDecode(response.body);
    var temperature = (data['main']['temp'] - 273.15).round(); // Convert temperature to Celsius
    var weatherDescription = data['weather'][0]['description'];
    print('Current temperature in $city: $temperature°C');
    print('Weather conditions: $weatherDescription');
  } else {
    print('Failed to fetch weather data: ${response.statusCode}');
  }
}

void main() async {
  await fetchWeatherData();
}
