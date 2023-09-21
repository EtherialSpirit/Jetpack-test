@file:OptIn(ExperimentalComposeUiApi::class)

package com.example.jetpack_test

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_test.ui.theme.JetpacktestTheme
import kotlin.math.log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
            ){
                itemsIndexed(
                    listOf(
                        ItemRowData(R.drawable.image, "Artem", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                                "officia deserunt mollit anim id est laborum."),
                        ItemRowData(R.drawable.image2, "Mihail", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui" +
                                " officia deserunt mollit anim id est laborum."),
                        ItemRowData(R.drawable.image3, "Duein", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
                                "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
                                "officia deserunt mollit anim id est laborum."),
                        ItemRowData(R.drawable.image4, "Bob", "Lorem ipsum dolor sit amet, " +
                                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore " +
                                "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                                "ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                                "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
                                "proident, sunt in culpa qui officia deserunt mollit anim id est laborum."),
                        ItemRowData(R.drawable.image5, "Joe", "Lorem ipsum dolor sit amet, " +
                                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                                "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                                "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure " +
                                "dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla " +
                                "pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
                                "deserunt mollit anim id est laborum."),
                        ItemRowData(R.drawable.image6, "Yill", "Lorem ipsum dolor sit amet, " +
                                "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore " +
                                "et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                                "ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor " +
                                "in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur." +
                                " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                                "mollit anim id est laborum."),
                    )
                ){_, item ->
                    RowCompos(item = item)
                }
            }
//            LazyColumn(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier
//                    .fillMaxSize()
//                    ) {
//                itemsIndexed(
//                    listOf("Vasay", "Sany", "Piter", "Bob", "Lenny")
//                ) {index, iten ->
//                    Text(
//                        text = "Item $iten",
//                        fontSize = 20.sp,
//                        modifier = Modifier.padding(vertical = 10.dp)
//                    )
//                }
//            }

            // state
            //ExtendedExample {}

            //RowColumn()
//            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )
//                ListItem(name = "Artem Bolotov", prof ="1C" )


        }
    }
}
// Button states
@Composable
fun ExtendedExample(onClick: () -> Unit) {
    var color = remember {
        mutableStateOf(Color.Cyan)
    }
    var counter = remember {
        mutableStateOf(0)
    }
    OutlinedButton(
        onClick = {
            when(counter.value++){
                10 -> color.value = Color.Green
                20 -> color.value = Color.Blue
                30 -> color.value = Color.Yellow
            }
                  },
        modifier = Modifier
            .background(color = color.value)
            .size(100.dp)
            ) {
               Text(text = counter.value.toString(), fontSize = 30.sp)
    }


}

// Card & box
@Composable
private fun ListItem(name: String, prof: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .pointerInput(Unit) {
//                detectDragGesturesAfterLongPress { change, dragAmount ->
//                    Log.d("MyLog", "LongPress")
//                }
                detectHorizontalDragGestures { change, dragAmount ->
                    Log.d("MyLog", "Horizontal: $dragAmount")
                }
            }
            .clickable {
                Log.d("MyLog", "Clicked")
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Box() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = name)
                    Text(text = prof)
                }

            }

        }
    }
}


//Row&Column
@Composable
private fun RowColumn() {
    Row(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
            .fillMaxHeight(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .background(Color.Red)
                .fillMaxSize(0.3f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Privet")
            Text(text = "Alloha")
        }
        Column(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Privet")
            Text(text = "Alloha")
        }

    }
}

