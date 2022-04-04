package com.visarut.fivecard.data.repository

import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Suit

class DeckRepositoryImpl: DeckRepository {

    private val allNumber = listOf("2","3","4","5","6","7","8","9","10","J","Q","K","A")

    private val allSuite = listOf(Suit.Clubs,Suit.Diamonds,Suit.Hearts,Suit.Spades)

    private var deck = listOf<Card>()

    init {
        createCardDeck()
    }
    override fun getRandomCard(amount: Int): List<Card> {
        var list = emptyList<Card>()
        for (i in 1..amount) list += deck.random()
        return list
    }

    private fun createCardDeck() {
        for (suite in allSuite)  {
            for (number in allNumber)  {
                deck += Card(number, suite)
            }
        }
    }
}