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

class MenuActivity(val category: Category) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidERestaurantTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(text = category.name)

                        for (dish in category.dishes){
                            val context = LocalContext.current

                            Button(onClick = {
                                Toast.makeText(context, "Voilà $dish", Toast.LENGTH_SHORT).show()
                            },
                            ) {
                                Text(text = dish)
                            }

                            Button(onClick = {
                                Toast.makeText(context, "Going back to Home", Toast.LENGTH_SHORT).show()
                            },)
                            {
                                Text(text = "Back")
                            }
                        }

                    }
                }
            }
        }
    }

}