package com.example.munchiees

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.munchiees.ui.theme.MunchieesTheme

class PizzaTypes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchieesTheme {
                Pizza_Types()
            }
        }
    }
}

@Composable
fun Pizza_Types(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
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
                    text = "PIZZA TYPES",
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
            Card(
                modifier = Modifier,
                shape = RoundedCornerShape(10.dp)
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.paneerpizza), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "PANEER PIZZA - 140 RS", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
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
                shape = RoundedCornerShape(10.dp)
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.cheesypizza), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "CHEESY PIZZA - 150 RS", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
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
                shape = RoundedCornerShape(10.dp)
            )
            {
                Box(modifier = Modifier
                    .padding(5.dp)
                    .height(100.dp)
                    .fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.chickenpizza), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "CHICKEN PIZZA - 200 RS", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
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
fun PizzaTypesPreview() {
    MunchieesTheme {
        Pizza_Types()
    }
}