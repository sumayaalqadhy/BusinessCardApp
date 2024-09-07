package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Android
import androidx.compose.material.icons.outlined.Code
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                    }
                }
            }
        }
    }

@Composable
fun BusinessCardApp(){
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFE6F2E6))
    ) {
        Introduction(
            name = "Sumaya Alqadhy",
            title = "Android Software Engineer",
            modifier = Modifier.weight(1f)
        )
        BusinessCardDetails(
            number = "510-921-4896",
            gitHub = "github.com/sumayaalqadhy",
            email = "sumaya.alqadhy@gmail.com",
            modifier = Modifier
                .weight(1f)
                .padding(bottom = 100.dp)
        )
    }
}

@Composable
fun Introduction(name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(top = 200.dp)
    ) {
        Icon(
            imageVector = Icons.Outlined.Android,
            contentDescription = "Android icon",
            tint = Color(0xFF3ddc84),
            modifier = Modifier
                .size(80.dp)
        )
        Text(
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier
        )

        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF3ddc84),
            modifier = Modifier

        )
    }
}

@Composable
fun BusinessCardDetails(number: String, gitHub: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .fillMaxSize()
            .offset(x = 80.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier

        ) {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = "cell",
                tint = Color.Black

            )
            Text(
                text = number,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 4.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
        ) {
            Icon(imageVector = Icons.Outlined.Code,
                contentDescription = "github",
                tint = Color.Black
            )
            Text(
                text = gitHub,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 4.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
        ) {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = "email",
                tint = Color.Black
            )
            Text(
                text = email,
                color = Color.Black,
                modifier = Modifier
                    .padding(start = 4.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}