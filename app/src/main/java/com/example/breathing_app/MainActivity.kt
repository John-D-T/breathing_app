package com.example.breathing_app

import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.breathing_app.ui.theme.Breathing_appTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Breathing_appTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        appName = "Hale",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
            InteractiveButton()
        }
    }
}

@Composable
fun InteractiveButton() {
//    var enteredAmount by remember { mutableStateOf("") }
//    var amountToSend by remember { mutableStateOf("0") }

    Column {
        // Composable function
        Button(onClick = { "to be filled in" }) {
            Text(text = "Send Amount")
        }
    }
}

@Composable
fun Greeting(appName: String, modifier: Modifier = Modifier) {
    Surface(color=Color.Black) {
        Text(
            text = "Welcome to $appName!",
            color = Color.White,
            modifier = modifier.padding(24.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Breathing_appTheme {
        Greeting("Hale")
        InteractiveButton()
    }
}