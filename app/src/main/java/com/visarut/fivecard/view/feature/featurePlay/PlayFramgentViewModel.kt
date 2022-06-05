package com.visarut.fivecard.view.feature.featurePlay

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Player
import com.visarut.fivecard.data.response.TwoCard
import com.visarut.fivecard.domain.model.PlayerData
import com.visarut.fivecard.domain.usecase.GetRandomCardUseCase
import com.visarut.fivecard.domain.usecase.GetTwoCardUseCase
import java.util.*

class PlayFramgentViewModel(
    val getRandomCardUseCase: GetRandomCardUseCase,
    val getTwoCardUseCase: GetTwoCardUseCase
) : ViewModel() {
    var cardList: MutableLiveData<List<Card>> = MutableLiveData()
    var playerList: MutableLiveData<List<Player>> = MutableLiveData()

    init {
        updateCard()
        mockPlayerAndCard()
    }

    fun updateCard() {
        cardList.value = getRandomCardUseCase.getRandomCard(20)
        mockPlayerAndCard()
//        Log.d("test","${cardList.value}")
    }

    private fun mockPlayerAndCard() {
        val player1 = Player(
            "p1",
            UUID.randomUUID().toString(),
            selectCard(0,5),
            getTwoCard(selectCard(0,2))
        )
        val player2 = Player(
            "p2",
            UUID.randomUUID().toString(),
            selectCard(5,10),
            getTwoCard(selectCard(5,7))
        )
        val player3 = Player("p3",
            UUID.randomUUID().toString(),
            selectCard(10,15),
            getTwoCard(selectCard(10,12))
        )
        val player4 = Player(
            "p4",
            UUID.randomUUID().toString(),
            selectCard(15,20),
            getTwoCard(selectCard(15,17))
        )
        playerList.value = listOf(player1, player2, player3, player4)
    }

    private fun selectCard(from: Int, until: Int): List<Card> {
        return cardList.value?.subList(from, until) ?: emptyList()
    }

    private fun getTwoCard(cardList: List<Card>): TwoCard {
        return getTwoCardUseCase.getTwoCard(cardList)
    }
}