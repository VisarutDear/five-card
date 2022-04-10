package com.visarut.fivecard.data.response

enum class SpecialType {
    sort, triple, loyal, sort_suited
}

data class ThreeCard(
    val point: Int,
    val suited: Boolean,
    val suit: Suit,
    val highCard: String,
    val specialType: SpecialType
)
