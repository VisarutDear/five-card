package com.visarut.fivecard.domain.model

import androidx.lifecycle.MutableLiveData
import com.visarut.fivecard.data.response.Player

data class PlayerData(
    var playerList: MutableLiveData<List<Player>>,
)