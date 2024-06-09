package com.example.xuong_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.xuong_kotlin.ui.theme.Xuong_KotlinTheme

class CartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Xuong_KotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Succes()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Succes() {
    data class Item(var url: Int, var name: String, var secondName: String, var price: String)

    var listItem = remember {
        mutableStateListOf(
            Item(R.drawable.sanpham1, "Greek salad ", "with baked salmon", "12.00"),
            Item(R.drawable.sanpham1, "Greek salad ", "with baked salmon", "12.00"),
            Item(R.drawable.sanpham1, "Greek salad ", "with baked salmon", "12.00"),
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Your Favorite",
                fontSize = 22.sp,
                fontWeight = FontWeight(800),
                lineHeight = 20.sp
            )
            Row(
//                modifier = Modifier.fillMaxWidth()
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.check), contentDescription = "",
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .size(20.dp)
                )
                Text(
                    text = "Check all",
                    fontSize = 10.sp,
                    fontWeight = FontWeight(800),
                    lineHeight = 14.sp
                )
            }
        }
        LazyColumn(
            modifier = Modifier
                .weight(2f)
                .padding(top = 20.dp)
        ) {
            items(listItem) { item ->
                Row(
                    modifier = Modifier
                        .padding(bottom = 25.dp)
                        .fillMaxWidth()
                        .height(82.dp)
                ) {
                    Image(
                        painter = painterResource(id = item.url), contentDescription = "",
                        modifier = Modifier
                            .width(78.dp)
                            .height(82.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column() {
                                Text(
                                    text = "${item.name}",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight(800),
                                    lineHeight = 19.sp
                                )
                                Text(
                                    text = "${item.secondName}",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight(400),
                                    lineHeight = 16.sp,
                                    color = Color(0xff8C8A9D)
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.checkcam),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(20.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .padding(top = 12.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "${item.price}",
                                fontSize = 10.sp,
                                fontWeight = FontWeight(800),
                                lineHeight = 14.sp,
                                color = Color(0xffFE724C)
                            )
                            Row (
                                modifier = Modifier.width(85.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.trudetail),
                                    contentDescription = "",
                                    modifier = Modifier.size(28.dp)
                                )
                                Text(
                                    text = "02 ",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(100),
                                    lineHeight = 19.sp,
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.congdetail),
                                    contentDescription = "",
                                    modifier = Modifier.size(28.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
        Box (modifier = Modifier.weight(1f)){
           Column {
               Row (modifier = Modifier.padding(top=10.dp, bottom = 15.dp).fillMaxWidth(),
                   horizontalArrangement = Arrangement.SpaceBetween){
                   Row {
                       Text(
                           text = "Items: ",
                           fontSize = 10.sp,
                           fontWeight = FontWeight(400),
                           lineHeight = 14.sp,
                       )
                       Text(
                           text = "3",
                           fontSize = 10.sp,
                           fontWeight = FontWeight(800),
                           lineHeight = 14.sp,
                       )
                   }
                   Text(
                       text = "36$",
                       fontSize = 10.sp,
                       fontWeight = FontWeight(800),
                       lineHeight = 14.sp,
                   )
               }
               Row(modifier = Modifier.fillMaxWidth()) {
                   Text(
                       text = "Address: ",
                       fontSize = 10.sp,
                       fontWeight = FontWeight(400),
                       lineHeight = 14.sp,
                   )
                   Text(
                       text = "121/45 streets 5 ward 3 block LinhXuan state ThuDuc City Hochiminh",
                       fontSize = 10.sp,
                       fontWeight = FontWeight(800),
                       lineHeight = 14.sp,
                       maxLines = 1
                   )
               }
               Row (modifier = Modifier.padding(top=15.dp, bottom = 10.dp).fillMaxWidth()){
                   Text(
                       text = "Payment Method: ",
                       fontSize = 10.sp,
                       fontWeight = FontWeight(400),
                       lineHeight = 14.sp,
                   )
                   Text(
                       text = "MB Bank",
                       fontSize = 10.sp,
                       fontWeight = FontWeight(800),
                       lineHeight = 14.sp,
                       maxLines = 1
                   )
               }
               Button(
                   onClick = { /*TODO*/ }, modifier = Modifier
                       .padding(top = 20.dp, bottom = 27.dp)
                       .fillMaxWidth().height(48.dp),
                   shape = RoundedCornerShape(7.dp),
                   colors = ButtonDefaults.buttonColors(
                       containerColor = Color(0xffFF7400)
                   )
               ) {
                   Text(
                       text = "Check out",
                       fontSize = 16.sp,
                       fontWeight = FontWeight(800),
                       lineHeight = 18.sp,
                       color = Color.White,

                       )
               }
           }
        }
    }
}