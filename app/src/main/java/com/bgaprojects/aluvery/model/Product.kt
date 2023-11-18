package com.bgaprojects.aluvery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product(
    val name: String,
    val price: BigDecimal,
    val image: String? = null
)
