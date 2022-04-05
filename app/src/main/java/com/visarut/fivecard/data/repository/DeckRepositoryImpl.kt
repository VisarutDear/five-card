package com.visarut.fivecard.data.repository

import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Suit

class DeckRepositoryImpl: DeckRepository {

    private val allNumber = listOf("2","3","4","5","6","7","8","9","10","J","Q","K","A")

    private val allSuite = listOf(Suit.Clubs,Suit.Diamonds,Suit.Hearts,Suit.Spades)

    private var deck = mutableListOf<Card>()

    init {
        createCardDeck()
    }
    override fun getRandomCard(amount: Int): List<Card> {
        createCardDeck()
        val list = emptyList<Card>().toMutableList()
        for (i in 1..amount) {
            val randomCard = (0 until deck.size).random()
            list += deck[randomCard]
            deck.remove(deck[randomCard])
        }
        return list
    }

    private fun createCardDeck() {
        deck.clear()
        for (suite in allSuite)  {
            for (number in allNumber)  {
                deck.add(Card(number, suite))
            }
        }
    }
}