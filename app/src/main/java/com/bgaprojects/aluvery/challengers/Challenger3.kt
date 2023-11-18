package com.bgaprojects.aluvery.challengers

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bgaprojects.aluvery.R
import com.bgaprojects.aluvery.components.ProductItem
import com.bgaprojects.aluvery.model.Product
import java.math.BigDecimal

@Composable
fun Challenger3() {
    Column {
        Text(
            text = "Promoções",
            fontSize = 22.sp,
            fontWeight = FontWeight(400)
        )

        Row(
            Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                Modifier
                    .width(200.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ProductItem(
                    Product(
                        name = "Hamburger",
                        image = null,
                        price = BigDecimal("12.99")
                    )
                )
                Text(
                    text = LoremIpsum(100).values.first(),
                    Modifier
                        .padding(top = 8.dp),
                    fontSize = 16.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Column(
                Modifier
                    .width(200.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ProductItem(
                    Product(
                        name = "Hamburger",
                        image = null,
                        price = BigDecimal("12.99")
                    )
                )
                Text(
                    text = LoremIpsum(100).values.first(),
                    Modifier
                        .padding(top = 8.dp),
                    fontSize = 16.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Column(
                Modifier
                    .width(200.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ProductItem(
                    Product(
                        name = "Hamburger",
                        image = null,
                        price = BigDecimal("12.99")
                    )
                )
                Text(
                    text = LoremIpsum(100).values.first(),
                    Modifier
                        .padding(top = 8.dp),
                    fontSize = 16.sp,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true, heightDp = 500)
@Composable
private fun Challenger3Preview() {
    Challenger3()
}