package com.example.xuong_kotlin
import android.os.Bundle
import android.support.v4.os.IResultReceiver2.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xuong_kotlin.ui.theme.Orange
import com.example.xuong_kotlin.ui.theme.Xuong_KotlinTheme
import com.example.xuong_kotlin.ui.theme.nen
import com.example.xuong_kotlin.ui.theme.xam

class ProductActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Xuong_KotlinTheme(){
                Body()
            }
        }
    }
        @Composable
        fun Body() {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = nen)
            ) {
                Main()
            }
        }


    @Composable
    fun Main() {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                       painter = painterResource(id = R.drawable.backleft),
                        contentDescription = "",
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                    )
                    Text(
                        text = "Featured Partner",
                        color = Orange,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(horizontal = 30.dp, vertical = 10.dp)
                    )
                }
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)

                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.monan),
                            contentDescription = "",
                            modifier = Modifier
                                .height(150.dp)
                                .width(450.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(15.dp)),
                            contentScale = ContentScale.FillBounds
                        )
                        Text(
                            text = "McDonald's",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                        )
                        Row {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.xedap),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "Free delivery",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.time),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "10-15 mins",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .padding(bottom = 20.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .align(Alignment.CenterVertically)
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                        }
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)

                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.monan),
                            contentDescription = "",
                            modifier = Modifier
                                .height(150.dp)
                                .width(450.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(15.dp)),
                            contentScale = ContentScale.FillBounds
                        )
                        Text(
                            text = "McDonald's",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                        )
                        Row {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.xedap),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "Free delivery",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.time),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "10-15 mins",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .padding(bottom = 20.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .align(Alignment.CenterVertically)
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                        }
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color.White)

                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(15.dp))
                            .background(Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.monan),
                            contentDescription = "",
                            modifier = Modifier
                                .height(150.dp)
                                .width(450.dp)
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(15.dp)),
                            contentScale = ContentScale.FillBounds
                        )
                        Text(
                            text = "McDonald's",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                        )
                        Row {
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.xedap),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "Free delivery",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawble.time),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(20.dp)
                                        .width(20.dp)
                                )
                                Text(
                                    text = "10-15 mins",
                                    fontSize = 18.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(horizontal = 5.dp)
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .padding(bottom = 20.dp, start = 10.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .align(Alignment.CenterVertically)
                            )
                            Text(
                                text = "BURGER",
                                color = Color.Black,
                                modifier = Modifier
                                    .background(color = xam)
                                    .padding(horizontal = 10.dp, vertical = 5.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            )
                        }
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultView {
        Xuong_KotlinTheme(){
            Body()
        }
        }
    }

