package com.example.munchiees

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
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

class ListOfHotels : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MunchieesTheme {
                List_Of_Hotels()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun List_Of_Hotels(){
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
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
                color = Color.Green
            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_restaurant_24),
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
                    text = "LIST OF HOTELS",
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
                color = Color.Green
            ){
                Text(
                    text = "IN ORDER TO VIEW ITEMS \n PLEASE PICK YOUR HOTEL OF YOUR DESIRE",
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
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel1::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel1), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Bloom & Bites", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel2::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel2), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Velvet Table", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel3::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel3), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Ivory Platter", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel4::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel4), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Ember Grains", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel5::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel5), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Luna Lounge", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel6::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel6), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Azure Bistro", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel7::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel7), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Opal Orbits", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel8::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel8), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Zenith Dine", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel9::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel9), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Echo Eats", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.width(150.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {
                    val intent = Intent(context, Hotel10::class.java)
                    context.startActivity(intent)
                }
            )
            {
                Box(modifier = Modifier.padding(5.dp).height(75.dp).fillMaxWidth()){
                    Image(painter = painterResource(id = R.drawable.hotel10), contentDescription = null, modifier = Modifier.fillMaxWidth())
                }
                Box(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Enchanted Nook", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
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
fun List_Of_HotelsPreview() {
    MunchieesTheme {
        List_Of_Hotels()
    }
}



