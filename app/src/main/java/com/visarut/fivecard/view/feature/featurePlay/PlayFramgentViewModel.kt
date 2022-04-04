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
        cardList.value = getRandomCardUseCase.getRandomCard(5)
        Log.d("test","${cardList.value}")
    }

    fun mockPlayerAndCard() {

//        var tempObj = playerList.value
//        val oldList = tempObj?.toMutableList()
//        oldList?.addAll(newObj)
//
//        tempObj = oldList
//        tempObj.apply {
//            playerList.value
//        }
    }
}