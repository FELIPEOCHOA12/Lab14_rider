package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.lab14.ui.theme.Lab14Theme
//Felipe hHebert Ochoa Patiño
class WorkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab14Theme {
                Text(text = "Welcome to WorkActivity!")
            }
        }
    }
}
