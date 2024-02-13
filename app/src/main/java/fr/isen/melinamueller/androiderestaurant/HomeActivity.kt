package fr.isen.melinamueller.androiderestaurant

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import fr.isen.melinamueller.androiderestaurant.ui.theme.AndroidERestaurantTheme
import android.content.Intent
import androidx.compose.material3.Divider

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidERestaurantTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                        view()
                    }
                }
            }
        }

    fun switchToCategory(categoryName: String){
        val switchToCategoryIntent = Intent(this, MenuActivity::class.java)
        switchToCategoryIntent.putExtra("categoryName", categoryName)
        startActivity(switchToCategoryIntent)
    }

    @Composable
    fun view() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Bienvenue!")
            Divider()

            val context = LocalContext.current

            Button(
                onClick = {
                    Toast.makeText(context, "Voilà les entrées", Toast.LENGTH_SHORT).show()
                    switchToCategory("entrees")
                },
            ) {
                Text(text = "Entrées")
            }
            Button(onClick = {
                Toast.makeText(context, "Voilà les plats", Toast.LENGTH_SHORT).show()
                switchToCategory("plats")
            }) {
                Text(text = "Plats")
            }
            Button(onClick = {
                //Toast.makeText(context, "Voilà les desserts", Toast.LENGTH_SHORT, modifier = Modifier.)
                Toast.makeText(context, "Voilà les desserts", Toast.LENGTH_SHORT).show()
                switchToCategory("desserts")
            }) {
                Text(text = "Desserts")
            }

        }
    }
}