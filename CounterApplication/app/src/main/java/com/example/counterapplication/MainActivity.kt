package com.example.counterapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.textViewCount)

        findViewById<Button>(R.id.buttonIncrement).setOnClickListener {
            incrementCount()
        }

        findViewById<Button>(R.id.buttonDecrement).setOnClickListener {
            decrementCount()
        }

        findViewById<Button>(R.id.buttonReset).setOnClickListener {
            resetCount()
        }
    }

    private fun incrementCount() {
        count++
        updateCountText()
    }

    private fun decrementCount() {
        count--
        updateCountText()
    }

    private fun resetCount() {
        count = 0
        updateCountText()
    }

    private fun updateCountText() {
        countTextView.text = count.toString()
    }
}

//package com.example.counterapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.counterapplication.ui.theme.CounterApplicationTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            CounterApplicationTheme {
//                CounterApp()
//            }
//        }
//    }
//}
//
//@Composable
//fun CounterApp() {
//    var count by remember { mutableStateOf(0) }
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Text(text = count.toString(), fontSize = 48.sp, modifier = Modifier.padding(bottom = 32.dp))
//
//        Button(onClick = { count++ }, modifier = Modifier.padding(8.dp)) {
//            Text("Increment")
//        }
//
//        Button(onClick = { count-- }, modifier = Modifier.padding(8.dp)) {
//            Text("Decrement")
//        }
//
//        Button(onClick = { count = 0 }, modifier = Modifier.padding(8.dp)) {
//            Text("Reset")
//        }
//    }
//}
