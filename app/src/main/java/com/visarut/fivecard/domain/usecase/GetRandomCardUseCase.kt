package com.visarut.fivecard.domain.usecase

import com.visarut.fivecard.data.repository.DeckRepository
import com.visarut.fivecard.data.response.Card

class GetRandomCardUseCase (
    val deckRepository: DeckRepository
        ) {
    fun getRandomCard(amount: Int): List<Card> {
        return deckRepository.getRandomCard(amount)
    }
}