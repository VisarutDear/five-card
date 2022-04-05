package com.visarut.fivecard.view.feature.featurePlay

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Player
import com.visarut.fivecard.domain.model.PlayerData
import com.visarut.fivecard.domain.usecase.GetRandomCardUseCase

class PlayFramgentViewModel(
    val getRandomCardUseCase: GetRandomCardUseCase
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

    fun mockPlayerAndCard() {
        val player1 = Player("p1", selectCard(0,5))
        val player2 = Player("p2", selectCard(5,10))
        val player3 = Player("p3", selectCard(10,15))
        val player4 = Player("p4", selectCard(15,20))
        playerList.value = listOf(player1, player2, player3, player4)
    }

    fun selectCard(from: Int, until: Int): List<Card> {
        return cardList.value?.subList(from, until) ?: emptyList()
    }
}