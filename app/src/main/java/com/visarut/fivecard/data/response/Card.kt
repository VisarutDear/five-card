package com.visarut.fivecard.data.response

enum class Suit {
    Clubs, Diamonds, Hearts, Spades
}

data class Card(
    val number: String,
    val suit: Suit,
)