package com.visarut.fivecard.data.response

import androidx.lifecycle.MutableLiveData

data class Player(
    val name: String,
    var cardList: List<Card>
)