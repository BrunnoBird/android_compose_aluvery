package com.bgaprojects.aluvery.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bgaprojects.aluvery.components.CardProductItem
import com.bgaprojects.aluvery.components.ProductSection
import com.bgaprojects.aluvery.components.SearchTextField
import com.bgaprojects.aluvery.model.Product
import com.bgaprojects.aluvery.sampledata.sampleProducts
import com.bgaprojects.aluvery.sampledata.sampleSections
import com.bgaprojects.aluvery.ui.theme.AluveryTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>,
    searchText: String = ""
) {
    Column {
        var text by remember { mutableStateOf(searchText) }
        val searchedProducts = remember(text) {
            if (text.isNotBlank()) {
                sampleProducts.filter { product ->
                    product.name.contains(
                        text,
                        ignoreCase = true
                    ) || product.description?.contains(
                        text,
                        ignoreCase = true
                    ) ?: false
                }
            } else emptyList()
        }

        SearchTextField(
            searchText = text,
            onSearchChange = { text = it },
        )

        MainContent(sections, text, searchedProducts)
    }
}

@Composable
private fun MainContent(
    sections: Map<String, List<Product>>,
    valueText: String,
    searchedProducts: List<Product>
) {
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(bottom = 16.dp)
    ) {
        if (valueText.isBlank()) {
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
        } else {
            items(searchedProducts) {
                CardProductItem(
                    product = it,
                    Modifier.padding(horizontal = 16.dp),
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
            HomeScreen(sampleSections)
        }
    }
}