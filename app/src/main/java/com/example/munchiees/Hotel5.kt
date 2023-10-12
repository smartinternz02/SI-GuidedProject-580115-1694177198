package com.example.munchiees

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.munchiees.ui.theme.MunchieesTheme

class Hotel5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchieesTheme {
                Hotel_5()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Hotel_5(){
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(
            modifier = Modifier
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Surface(
                modifier = Modifier,
                color = Color.Green
            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_fastfood_24),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(30.dp))
            }
            Surface(
                modifier = Modifier,
                color = Color.Black
            ){
                Text(
                    text = "LIST OF ITEMS",
                    style = TextStyle(fontSize = 15.sp, fontFamily = FontFamily.Serif, letterSpacing = 7.5.sp),
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Surface(
                modifier = Modifier,
                color = Color.Red
            ){
                Text(
                    text = "LUNA LOUNGE",
                    style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold),
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Surface(
                modifier = Modifier,
                color = Color.Green
            ){
                Text(
                    text = "IN ORDER TO VIEW \n VARIOUS TYPES OF FOOD AND ITS COST \n PLEASE PICK YOUR FOOD OF YOUR DESIRE",
                    style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold),
                    color = Color.Black,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, PizzaTypes::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.pizza), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "PIZZA", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, BiryaniTypes::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.biryani), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "BIRYANI", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, MilkshakeTypes::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.milkshake), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "MILKSHAKE", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun Hotel5Preview() {
    MunchieesTheme {
        Hotel_5()
    }
}