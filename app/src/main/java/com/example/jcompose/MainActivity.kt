package com.example.jcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcompose.ui.theme.JComposeTheme
import androidx.compose.material.ButtonDefaults.buttonColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JComposeTheme() {
                DefaultPreview()
            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(modifier = Modifier.padding(all = 12.dp)) {
        
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription ="Image" , modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
                .scale(9F)

                )

        Column(modifier = Modifier.padding(all = 9.dp)) {

            Text(text = "Hello $name!")
            Button(modifier = Modifier.padding(start = 1.dp, top = 10.dp)

                ,onClick = { },  colors = ButtonDefaults.buttonColors(
                    backgroundColor = com.example.jcompose.ui.theme.Purple700,
                    contentColor = Color.White)) {
                    Text(text = "Click!")
            }
            

        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   Greeting(name = "JetCompose")
}