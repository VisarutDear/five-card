package com.visarut.fivecard.data.repository

import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.TwoCard

interface GameRepository {
    fun getTwoCard(cardList: List<Card>): TwoCard
    fun getThreeCard(cardList: List<Card>)
}