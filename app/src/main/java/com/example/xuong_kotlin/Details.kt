package com.example.xuong_kotlin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Details {

    @Preview(showBackground = true)
    @Composable
    fun Body() {
        Column(
            modifier = Modifier
                .padding(22.dp)
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .paint(
                        painter = painterResource(id = R.drawable.p1),
                        contentScale = ContentScale.FillBounds
                    )
                    .clip(shape = RoundedCornerShape(10.dp))
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .width(38.dp)
                            .height(38.dp)
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.back),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(5.dp)
                                .height(10.dp),
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(32.dp)
                            .height(32.dp)
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(Color.White),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.heart),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .width(23.dp)
                                .height(23.dp),
                        )
                    }
                }
            }
            Text(
                text = "Ground Beef Tacos",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(vertical = 20.dp)
            )
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.start),
                        contentDescription = "",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .width(17.dp)
                            .height(17.dp)
                    )
                    Text(
                        text = "4.5",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                    Text(
                        text = "(30+)",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0XFF9796A1),
                    )
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.ship),
                        contentDescription = "",
                        modifier = Modifier
                            .width(16.dp)
                            .height(11.dp),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "Free delivery",
                        fontSize = 12.sp,
                        color = Color(0XFF7E8392),
                        modifier = Modifier.padding(start = 7.dp, end = 25.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.time),
                        contentDescription = "",
                        modifier = Modifier
                            .width(12.dp)
                            .height(12.dp),
                        contentScale = ContentScale.FillBounds
                    )
                    Text(
                        text = "10-15 mins",
                        fontSize = 12.sp,
                        color = Color(0XFF7E8392),
                        modifier = Modifier.padding(start = 7.dp)
                    )
                }
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp, bottom = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "9.35 $",
                    fontSize = 14.sp,
                    color = Color(0XFF22A45D),
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .width(28.dp)
                            .height(28.dp)
                            .clip(shape = RoundedCornerShape(14.dp))
                            .background(Color.White)
                            .border(
                                width = 1.dp,
                                color = Color(0XFFFF7400),
                                shape = RoundedCornerShape(14.dp)
                            ),
                        contentAlignment = Alignment.Center

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.tru),
                            contentDescription = "",
                            modifier = Modifier.width(10.dp),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Text(
                        text = "02",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                    Box(
                        modifier = Modifier
                            .width(28.dp)
                            .height(28.dp)
                            .clip(shape = RoundedCornerShape(14.dp))
                            .background(Color(0XFFFF7400)),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.cong),
                            contentDescription = "",
                            modifier = Modifier
                                .width(10.dp)
                                .height(10.dp),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                }
            }
            Text(
                text = "Brown the beef better. Lean ground beef – I like to use 85% lean angus. Garlic – use fresh  chopped. Spices – chili powder, cumin, onion powder.",
                fontSize = 12.sp,
                color = Color(0XFF858992),
                textAlign = TextAlign.Justify
            )
            Box(
                modifier = Modifier
                    .padding(vertical = 25.dp)
                    .fillMaxWidth()
                    .height(45.dp)
                    .background(Color(0XFFC0C0C0)),

                ) {
                Text(
                    text = "You haven’t buy this dish",
                    fontSize = 12.sp,
                    color = Color(0XFF395998),
                    modifier = Modifier.padding(vertical = 15.dp, horizontal = 10.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Restaurant’ss Featured Partner",
                    fontSize = 14.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "See all",
                    fontSize = 10.sp,
                    color = Color(0XFF22A45D),
                )
            }
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Image(
                    painter = painterResource(id = R.drawable.p1),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .width(266.dp)
                        .height(136.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.FillBounds
                )
                Image(
                    painter = painterResource(id = R.drawable.p1),
                    contentDescription = "",
                    modifier = Modifier
                        .width(266.dp)
                        .height(136.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.FillBounds
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(250.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(Color(0XFFFF7400))
                ) {
                    Text(text = "Add to cart", fontSize = 16.sp, color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .width(48.dp)
                        .height(48.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .border(
                            width = 1.dp,
                            color = Color(0x33000000),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    contentAlignment = Alignment.Center,

                    ) {
                    Image(
                        painter = painterResource(id = R.drawable.warning),
                        contentDescription = "",
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp),
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }

}