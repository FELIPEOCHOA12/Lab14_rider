package com.example.lab14

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab14.ui.theme.Lab14Theme

// Felipe Hebert Ochoa Patiño
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilitar diseño Edge-to-Edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            Lab14Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Utilizando innerPadding para aplicar el relleno al contenido
                    SimpleWidget(
                        modifier = Modifier.padding(innerPadding),
                        navigateToHome = {
                            // Lógica para navegar a "Home"
                            startActivity(Intent(this, MainActivity::class.java))
                        },
                        navigateToWork = {
                            // Lógica para navegar a "WorkActivity" (crear la actividad WorkActivity si es necesario)
                            startActivity(Intent(this, WorkActivity::class.java))
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun SimpleWidget(
    modifier: Modifier = Modifier,
    navigateToHome: () -> Unit,
    navigateToWork: () -> Unit
) {
    // Ejemplo de un widget simple con botones
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello from SimpleWidget!"
        )
        Button(
            onClick = navigateToHome
        ) {
            Text(text = "Home")
        }
        Button(
            onClick = navigateToWork
        ) {
            Text(text = "Work")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab14Theme {
        SimpleWidget(
            navigateToHome = {},
            navigateToWork = {}
        )
    }
}
