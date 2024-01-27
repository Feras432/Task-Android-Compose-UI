package com.counter.taskandroidcomposeui2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.counter.taskandroidcomposeui2.ui.theme.TaskAndroidComposeUI2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskAndroidComposeUI2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(14.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@Composable
fun MainApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Game()
    }

}

@Composable
fun Game() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(
            text = "Is Android an operating system ?",
            fontSize = 20.sp
        )

        Button(
            onClick = {},
            modifier = Modifier.width(350.dp)
        ) {
            Text(
                text = "Next Question",
                fontSize = 20.sp
            )

        }
    }
    Row {
        Button(
            onClick = {},
            modifier = Modifier.width(150.dp)

        ) {
            Text(
                "True",
                fontSize = 20.sp
            )

        }

        Button(
            onClick = { },
            modifier = Modifier.width(150.dp)

        ) {
            Text(
                "False",
                fontSize = 20.sp
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskAndroidComposeUI2Theme {
        MainApp()
    }
}