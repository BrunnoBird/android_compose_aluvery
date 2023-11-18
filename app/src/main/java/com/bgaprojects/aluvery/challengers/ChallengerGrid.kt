package com.bgaprojects.aluvery.challengers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bgaprojects.aluvery.components.ProductItem
import com.bgaprojects.aluvery.model.Product

@Composable
private fun DesafioGrid(sections: Map<String, List<Product>>) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize(),
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (section in sections) {
            val allProducts: List<Product> = section.value

            allProducts.forEach {
                item { ProductItem(product = it) }
            }
        }
    }
}