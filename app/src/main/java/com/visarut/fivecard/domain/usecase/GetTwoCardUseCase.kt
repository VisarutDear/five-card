package com.visarut.fivecard.domain.usecase

import com.visarut.fivecard.data.repository.GameRepository
import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.TwoCard

class GetTwoCardUseCase (
    private val gameRepository: GameRepository
        ) {
    fun getTwoCard(cardList: List<Card>): TwoCard {
        return gameRepository.getTwoCard(cardList)
    }
}