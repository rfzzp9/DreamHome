package com.example.dreamhouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dreamhouse.ui.theme.DreamHouseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DreamHouseTheme {
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
fun BottomAppBarExample() {
    val scaffoldState = rememberScaffoldState()

    Scaffold (
        scaffoldState = scaffoldState,
        bottomBar = {
                    BottomAppBar(backgroundColor = Color(0xFFF9F9F9))
            {
                Button(
                    border = BorderStroke(0.dp, Color(0xFFF9F9F9)),
                    shape = RoundedCornerShape(0.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF9F9F9)),
                    modifier = Modifier.weight(1f)) {
                    Column {
                        Icon(
                            painter = painterResource(R.drawable.home),
                            contentDescription = "",
                            modifier = Modifier
                                .size(27.dp)
                                .align(Alignment.CenterHorizontally),
                            tint = Color(0xFFAAAEB7)
                        )
                        Text(text = "홈", modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 10.sp, color = Color(0xFFAAAEB7))
                    }
                }
                Button(
                    border = BorderStroke(0.dp, Color(0xFFF9F9F9)),
                    shape = RoundedCornerShape(0.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF9F9F9)),
                    modifier = Modifier.weight(1f)) {
                    Column {
                        Icon(
                            painter = painterResource(R.drawable.marker),
                            contentDescription = "",
                            modifier = Modifier
                                .size(27.dp)
                                .align(Alignment.CenterHorizontally),
                            tint = Color(0xFFAAAEB7)
                        )
                        Text(text = "지도", modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 10.sp, color = Color(0xFFAAAEB7))
                    }
                }
                Button(
                    border = BorderStroke(0.dp, Color(0xFFF9F9F9)),
                    shape = RoundedCornerShape(0.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF9F9F9)),
                    modifier = Modifier.weight(1f)) {
                    Column {
                        Icon(
                            painter = painterResource(R.drawable.like),
                            contentDescription = "",
                            modifier = Modifier
                                .size(27.dp)
                                .align(Alignment.CenterHorizontally),
                            tint = Color(0xFFAAAEB7)
                        )
                        Text(text = "찜 목록", modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 10.sp, color = Color(0xFFAAAEB7))
                    }
                }
                Button(
                    border = BorderStroke(0.dp, Color(0xFFF9F9F9)),
                    shape = RoundedCornerShape(0.dp),
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF9F9F9)),
                    modifier = Modifier.weight(1f)) {
                    Column {
                        Icon(
                            painter = painterResource(R.drawable.etc),
                            contentDescription = "",
                            modifier = Modifier
                                .size(27.dp)
                                .align(Alignment.CenterHorizontally),
                            tint = Color(0xFFAAAEB7)
                        )
                        Text(text = "더보기", modifier = Modifier.align(Alignment.CenterHorizontally), fontSize = 10.sp, color = Color(0xFFAAAEB7))
                    }
                }
            }
        }
    ) {}


}

@Composable
fun Greeting(name: String) {
    BottomAppBarExample()
    ConstraintLayout() {
        val (searchEdittext, mapView) = createRefs()

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DreamHouseTheme {
        Greeting("Android")
    }
}