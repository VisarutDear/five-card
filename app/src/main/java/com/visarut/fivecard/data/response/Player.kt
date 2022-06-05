package com.visarut.fivecard.data.response

import androidx.lifecycle.MutableLiveData

data class Player(
    val name: String,
    val id: String,
    var cardList: List<Card>,
    val twoCard: TwoCard?,
//    val threeCard: ThreeCard?
)
