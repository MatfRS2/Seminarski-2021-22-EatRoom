package com.example.eatroom.model.data

data class Order(
    val id: Int,
    val userId: String,
    val dishes: List<String>,
    var state: OrderState,
    val delivererId: Int?
)