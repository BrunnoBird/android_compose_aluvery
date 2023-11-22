package com.bgaprojects.aluvery.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchTextField(
    searchText: String,
    onSearchChange: (String) -> Unit,
) {


    OutlinedTextField(
        value = searchText,
        onValueChange = { onSearchChange(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(100),
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "ícone de busca")
        },
        label = {
            Text(text = "Produto")
        },
        placeholder = {
            Text("O que você procura?")
        }
    )
}