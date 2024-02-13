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

class Dish(
    val name: String,
    val ingredients: List<String>,
    val price: Int,
    val images: List<String>)

class Category(
    val name: String,
    val dishes: List<String>
)

val entrees = Category("Entrées", listOf("Salad", "Soup", "Bruschetta"))
val plats = Category("Plats", listOf("Pasta", "Burger", "Pizza"))
val desserts = Category("Desserts", listOf("Mousse au chocolat", "gateau", "glace"))

val categoryMap = mapOf("entrees" to entrees, "plats" to plats, "desserts" to desserts)