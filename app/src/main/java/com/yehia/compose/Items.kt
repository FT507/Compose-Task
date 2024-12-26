package com.yehia.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yehia.compose.ui.theme.ComposeTheme

@Composable
fun Items(modifier: Modifier = Modifier){
    Row(
        Modifier.fillMaxWidth()
            .background(
                color = Color.Gray,
            )
            .padding(horizontal = 10.dp)
            .padding(top = 40.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(10.dp)
            )
    ){
        Image(
            modifier = Modifier.padding(top = 25.dp, start = 10.dp),
            painter = painterResource(R.drawable.icon),
            contentDescription = null
        )

        Column(modifier = Modifier.padding(start = 5.dp, top = 20.dp )) {
            Row(){
                Text(modifier = Modifier.weight(1f),text = "C")
                Text(text = "Open")

            }
            Text( text = "P1")
            Text( text = "P2")
            Text( text = "P3")

        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun PreviewItems(){
    ComposeTheme {
        Items()
    }
}
