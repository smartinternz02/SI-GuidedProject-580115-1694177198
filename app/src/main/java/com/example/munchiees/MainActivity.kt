package com.example.munchiees

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.munchiees.ui.theme.MunchieesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchieesTheme {
                LoginScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "WELCOME TO",
            style = TextStyle(fontSize = 36.sp, fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold),
            color = Color.Red,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "MUNCHIEES",
            style = TextStyle(fontSize = 50.sp,fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, letterSpacing = 7.5.sp),
            color = Color.Green,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "LOGIN PAGE",
            style = TextStyle(fontSize = 24.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, letterSpacing = 10.sp), // Adjust the font size as needed
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("USERNAME") },
            leadingIcon = {
                          Icon(imageVector = Icons.Default.Person, contentDescription = null)
            },
            placeholder = { Text("ENTER USERNAME") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("PASSWORD") },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = null)
            },
            placeholder = { Text("ENTER PASSWORD") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        )
        Button(
            onClick = {
                val intent = Intent(context, ListOfHotels::class.java)
                context.startActivity(intent)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.Green)
        ,
            modifier = Modifier

                .height(60.dp)
                .width(150.dp)
                .padding(vertical = 8.dp)
        ) {
            Text(text = "LOGIN")
        }
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            painter = painterResource(id = R.drawable.login_hotel),
            contentDescription = null
        )
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Munchiees LOGIN"
)
@Composable
fun GreetingPreview() {
    MunchieesTheme {
        LoginScreen()
    }
}