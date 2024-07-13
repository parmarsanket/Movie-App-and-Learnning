package com.example.practicebuildagrid

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun listBody(topic: Topic)
{
    val img = painterResource(id = R.drawable.architecture)
    Card (modifier = Modifier

        .fillMaxWidth()
        .wrapContentSize(),

        ){
        Row(modifier = Modifier.fillMaxWidth(1f)) {
             Image(painter =  painterResource(id = topic.img), contentDescription =null ,
                 modifier = Modifier.size(68.dp)
             )

            Box(modifier = Modifier
                .weight(1f)
                .padding(top = 16.dp, start = 16.dp, end = 16.dp), contentAlignment = Alignment.Center)
            {
                Column() {
                    Text(text = stringResource(id = topic.title),textAlign = TextAlign.Justify,fontSize = 14.sp)
                    Spacer(modifier =Modifier.padding( bottom = 8.dp))
                    Row (verticalAlignment = Alignment.CenterVertically){
                        Image(painter = painterResource(id = R.drawable.ic_grain), contentDescription =null )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Text(text = topic.label.toString(), textAlign = TextAlign.Justify, fontSize = 14.sp)

                    }

                }

            }

        }
    }


}
