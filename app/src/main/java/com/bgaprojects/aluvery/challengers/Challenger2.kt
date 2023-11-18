package com.bgaprojects.aluvery.challengers

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.bgaprojects.aluvery.R

@Preview("Challenger 02", showBackground = true)
@Composable
fun Challenger02() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {
        Row(
            Modifier
                .height(200.dp)
                .width(350.dp)
        ) {
            val imageSize = 100.dp

            Box(
                Modifier
                    .width(imageSize)
                    .fillMaxHeight()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
//                                Purple500, Teal200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(imageSize)
                        .offset(imageSize / 2)
                        .align(Alignment.Center)
                        .clip(shape = CircleShape)
                        .border(width = 2.dp, color = Color.DarkGray, shape = CircleShape)
                )
            }

            Spacer(
                Modifier
                    .width(imageSize / 2)
            )

            Text(
                text = LoremIpsum(30).values.first(),
                Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterVertically),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}