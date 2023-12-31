package com.bgaprojects.aluvery.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.bgaprojects.aluvery.model.Product
import java.math.BigDecimal

val sampleCandies = listOf(
    Product(
        name = "Chocolate",
        price = BigDecimal("3.99"),
        image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
    ),
    Product(
        name = "Sorvete",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg",
    ),
    Product(
        name = "Bolo",
        price = BigDecimal("11.99"),
        image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
    )
)

val sampleDrinks = listOf(
    Product(
        name = "Cerveja",
        price = BigDecimal("5.99"),
        image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
    ),
    Product(
        name = "Refrigerante",
        price = BigDecimal("4.99"),
        image = "https://images.pexels.com/photos/2775860/pexels-photo-2775860.jpeg"
    ),
    Product(
        name = "Suco",
        price = BigDecimal("7.99"),
        image = "https://images.pexels.com/photos/96974/pexels-photo-96974.jpeg"
    ),
    Product(
        name = "Água",
        price = BigDecimal("2.99"),
        image = "https://images.pexels.com/photos/327090/pexels-photo-327090.jpeg"
    )
)

val sampleProducts = listOf<Product>(
    Product(
        name = "Hamburger",
        image = "https://images.pexels.com/photos/1639557/pexels-photo-1639557.jpeg",
        price = BigDecimal("39.90"),
        description = LoremIpsum(50).values.first()
    ),
    Product(
        name = "Pizza",
        image = "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg",
        price = BigDecimal("99.90"),
        description = LoremIpsum(50).values.first()
    ),
    Product(
        name = "French P",
        image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
        price = BigDecimal("19.90")
    ),

    Product(
        name = "Fries M",
        image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
        price = BigDecimal("29.90")
    ),

    Product(
        name = "Fries G",
        image = "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg",
        price = BigDecimal("39.90"),
        description = LoremIpsum(50).values.first()
    ),
)

val sampleSections = mapOf(
    "Promoções" to sampleProducts,
    "Doces" to sampleCandies,
    "Bebidas" to sampleDrinks
)