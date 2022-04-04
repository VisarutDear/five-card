package com.visarut.fivecard.data.repository

import com.visarut.fivecard.data.response.Card

interface DeckRepository {
    fun getRandomCard(amount: Int): List<Card>
}