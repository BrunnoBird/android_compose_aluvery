package com.bgaprojects.aluvery.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bgaprojects.aluvery.components.ProductItem
import com.bgaprojects.aluvery.components.ProductSection
import com.bgaprojects.aluvery.model.Product
import com.bgaprojects.aluvery.sampledata.sampleSections
import com.bgaprojects.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>
) {
    DesafioGrid(sections)
}

@Composable
private fun DesafioGrid(sections: Map<String, List<Product>>) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize(),
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        for (section in sections) {
            val allProducts: List<Product> = section.value

            allProducts.forEach {
                item { ProductItem(product = it) }
            }
        }
    }
}

@Composable
private fun MainColumn(sections: Map<String, List<Product>>) {
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        for (section in sections) {
            val title = section.key
            val product = section.value
            item {
                ProductSection(
                    title = title,
                    products = product
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
//            HomeScreen(sampleSections)
            DesafioGrid(sampleSections)
        }
    }
}