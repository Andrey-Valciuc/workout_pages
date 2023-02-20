package com.example.fitness


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.ui.theme.FitnessTheme


@Composable
fun FullBody() {
    FitnessTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFE7E7E7))
        )
        {
            Appbar()
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.verticalScroll(
                    rememberScrollState()
                )
            ) {
                workout_type(
                    imageId = R.drawable.fullbody,
                    title = "FULL BODY\r\nWORKOUT",
                    colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                    ContDesc = "image1"
                )
                Day_box_start(dayText = "Day 1", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 2", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 3", exerciseText = "8 Exercises")
                Day_box_rest(dayText = "Day 4", exerciseText = "Rest Day")
                Day_box(dayText = "Day 5", exerciseText = "9 Exercises")
                Day_box(dayText = "Day 6", exerciseText = "9 Exercises")
                Day_box_rest(dayText = "Day 7", exerciseText = "Rest Day")
            }
        }
    }
}



@Composable
fun Appbar() {
    Surface(shape = RectangleShape, modifier = Modifier
        .fillMaxWidth()
        .shadow(15.dp)
        .height(60.dp)
        .fillMaxSize(),
        color = Color.White
    ){
        Box {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(60.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(5.dp)
                )
                Column {
                    Text(
                        text = "STRONG\n   MAN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    modifier = Modifier.size(50.dp)
                )
            }
        }
    }
}
@Composable
fun workout_type(imageId: Int, title: String,colors: List<Color> , ContDesc: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, start = 19.dp, end = 19.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = colors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.fillMaxSize() ,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.TopStart){
                Text(
                    text = title,
                    fontSize = 20.sp
                )
            }
        }
    }
}
@Composable
fun Day_box_start(
    dayText : String,
    exerciseText:String
) {
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(65.dp)
        .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }

            Button( modifier = Modifier
                .align(Alignment.CenterEnd)
                .height(21.dp)
                .width(80.dp)
                .padding(end = 16.dp),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFb2adef)),
                onClick = { /*TODO*/ },) {
                Text(text = "Start",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun Day_box(
    dayText : String,
    exerciseText:String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }
        }
    }
}

@Composable
fun Day_box_rest(
    dayText : String,
    exerciseText:String
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(horizontal = 19.dp),
        shape = RoundedCornerShape(5.dp),
        Color.White
    )
    {
        Box(modifier = Modifier.fillMaxSize())
        {
            Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
                Text(
                    text = dayText, modifier = Modifier
                        .padding(top = 10.dp, start = 24.dp), fontSize = 20.sp
                )

                Text(
                    text = exerciseText, modifier = Modifier
                        .padding(start = 24.dp), fontSize = 15.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.rest),
                contentDescription = "logo",
                modifier = Modifier
                    .size(35.dp)
                    .padding(end = 19.dp)
                    .align(alignment = Alignment.CenterEnd),

                )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FitnessTheme {

    }
}