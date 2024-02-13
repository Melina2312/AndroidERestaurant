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
import androidx.compose.material3.Divider

class MenuActivity : ComponentActivity() {
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

    @Composable
    fun view(){
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            val categoryName = intent.getStringExtra("categoryName")
            val category = categoryMap[categoryName]

            Text(text = category!!.name)

            Divider()

            val context = LocalContext.current

            for (dish in category.dishes){

                Button(onClick = {
                    Toast.makeText(context, "Voilà $dish", Toast.LENGTH_SHORT).show()
                },
                ) {
                    Text(text = dish)
                }

            }

            Divider()

            Button(onClick = {
                Toast.makeText(context, "Going back Home", Toast.LENGTH_SHORT).show()
                finish()
            },)
            {
                Text(text = "Back")
            }

        }
    }

}