package com.visarut.fivecard.view.feature.featurePlay

import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.carousel
import com.visarut.fivecard.*
import com.visarut.fivecard.domain.model.PlayerData

class PlayHomeController() : TypedEpoxyController<PlayerData>() {
    
    override fun buildModels(data: PlayerData?) {
        val playerMap = data?.playerList?.value?.mapIndexed { index, player ->
            PlayerNameBindingModel_().apply {
                id("player${index}")
                name(player.name)
            }

            player.cardList.mapIndexed { index2, card ->
                CardDeckBindingModel_().apply {
                    id("card${index2}_${player.name}")
                    number(card.number)
                    suit(card.suit)
                }
            }
        }

        data?.playerList?.value?.mapIndexed { index, player ->
            playerName {
                id("player${index}")
                name(player.name)
            }

            carousel {
                id("carousel_$index")
                player.cardList.mapIndexed { index2, card ->
                    CardDeckBindingModel_().apply {
                        id("card_player_${index2}")
                        number(card.number)
                        suit(card.suit)
                    }
                }.apply {
                    models(this)
                }
            }

        }

    }
}