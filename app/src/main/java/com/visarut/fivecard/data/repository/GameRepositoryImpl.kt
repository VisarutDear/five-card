package com.visarut.fivecard.data.repository

import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Suit
import com.visarut.fivecard.data.response.TwoCard

class GameRepositoryImpl: GameRepository {
    override fun getTwoCard(cardList: List<Card>): TwoCard {
        val sortedList = sortCard(cardList)
        var point = 0
        var isSuited = false
        val prevSuit: Suit? = null
        var highestCard: Card? = null
        sortedList.forEach {
            point += it.value
            if (prevSuit == null) {
                it.suit
            } else {
                if(prevSuit === it.suit) {
                    isSuited = true
                }
            }
            if (highestCard == null) {
                highestCard = Card(it.name, it.suit, it.index, it.value)
            } else {
                if(highestCard!!.index < it.index) {
                    highestCard = Card(it.name, it.suit, it.index, it.value)
                }
            }
        }
        return TwoCard(point, isSuited, highestCard!!)
    }

    override fun getThreeCard(cardList: List<Card>) {
        TODO("Not yet implemented")
    }

    private fun sortCard(cardList: List<Card>): List<Card> {
        return cardList.sortedBy {
            it.value
        }
    }
}