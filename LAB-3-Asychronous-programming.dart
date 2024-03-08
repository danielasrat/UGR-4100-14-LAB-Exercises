// Function to simulate loading data from a database asynchronously
Future<List<String>> loadDataFromDatabase() async {
  await Future.delayed(Duration(seconds: 2)); // Simulating delay
  return ['Data 1', 'Data 2', 'Data 3'];
}

void main() async {
  // Wait for the data to be loaded asynchronously
  var data = await loadDataFromDatabase();
  print('Data loaded: $data');
}
