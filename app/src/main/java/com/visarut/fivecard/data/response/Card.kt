package com.visarut.fivecard.data.response

enum class Suit {
    Clubs, Diamonds, Hearts, Spades
}

//enum class CardValue {
//    Two,
//    Three,
//    Four,
//    Five,
//    Six,
//    Seven,
//    Eight,
//    Nine,
//    Ten,
//    Jack,
//    Queen,
//    King,
//    Ace,
//}

data class Card(
    val name: String,
    val suit: Suit,
    val index: Int,
    val value: Int,
)