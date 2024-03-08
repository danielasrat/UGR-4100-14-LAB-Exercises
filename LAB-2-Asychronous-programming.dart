import 'dart:io';
import 'dart:convert';

// Function to download a file from a URL asynchronously
Future<void> downloadFile(String url, String savePath) async {
  var httpClient = HttpClient();
  var request = await httpClient.getUrl(Uri.parse(url));
  var response = await request.close();
  await response.pipe(File(savePath).openWrite());
  print('File downloaded successfully');
}

void main() async {
  var url = 'https://example.com/sample.txt'; // Replace with actual URL
  var savePath = 'sample.txt'; // Path to save the downloaded file
  await downloadFile(url, savePath);
}
