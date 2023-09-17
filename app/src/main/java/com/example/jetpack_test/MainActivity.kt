package com.example.jetpack_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_test.ui.theme.JetpacktestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Row(modifier = Modifier
                    .background(Color.Cyan)
                    .fillMaxSize()
                    .fillMaxHeight(),
                    horizontalArrangement = Arrangement.SpaceEvenly) {
                    Column(modifier = Modifier
                        .background(Color.Red)
                        .fillMaxSize(0.3f)
                        .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Hello")
                        Text(text = "Privet")
                        Text(text = "Alloha")
                    }
                    Column(modifier = Modifier
                        .background(Color.Green)
                        .fillMaxSize(0.5f)
                        .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text = "Hello")
                        Text(text = "Privet")
                        Text(text = "Alloha")
                    }

                }
            }
        }
    }

