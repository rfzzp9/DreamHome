package com.example.dreamhome

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dreamhome.ui.theme.DreamHomeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamHomeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    BottomAppBarExample()

    ConstraintLayout() {
        val (searchEdittext, mapView) = createRefs()

    }
}

@Composable
fun BottomAppBarExample() {
    val scaffoldState = rememberScaffoldState()

    Scaffold (
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomAppBar{
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f)) {
                    Column {
                        Icon(
                            imageVector = Icons.Filled.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.size(25.dp).align(Alignment.CenterHorizontally)
                        )
                        Text(text = "홈", modifier = Modifier.align(Alignment.CenterHorizontally))
                    }
                }
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f)
                ){
                    Text("지도")
                }
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f)
                ){
                    Text("찜 목록")
                }
                Button(
                    onClick = {},
                    modifier = Modifier.weight(1f)
                ){
                    Text("더보기")
                }
            }
        }
    ) {}



}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DreamHomeTheme {
        Greeting("Android")
    }
}



