package com.example.mycomposeapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun Action(){
    Text(
        text = "Urban University",
        fontSize = 32.sp,
        //color = Color.Green,
        modifier = Modifier
            .padding(16.dp)
            .background(Color.LightGray)
            .width(150.dp)

    )
}