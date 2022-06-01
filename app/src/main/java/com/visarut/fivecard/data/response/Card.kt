package com.visarut.fivecard.data.response

enum class Suit {
    Clubs, Diamonds, Hearts, Spades
}

data class Card(
    val name: String,
    val suit: Suit,
    val index: Int,
    val value: Int,
)