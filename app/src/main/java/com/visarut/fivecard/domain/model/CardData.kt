package com.visarut.fivecard.domain.model

import androidx.lifecycle.MutableLiveData
import com.visarut.fivecard.data.response.Card
import com.visarut.fivecard.data.response.Player

data class CardData(
    var cardList: MutableLiveData<List<Card>>,
)