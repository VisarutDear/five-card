package com.visarut.fivecard.view.feature.featurePlay

import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.carousel
import com.visarut.fivecard.*
import com.visarut.fivecard.domain.model.CardData

class PlayHomeController() : TypedEpoxyController<CardData>() {


    override fun buildModels(data: CardData?) {
        val cardMap = data?.cardList?.value?.mapIndexed{ index, card ->
            CardDeckBindingModel_().apply {
                id("card$index")
                number(card.number)
                suit(card.suit)
            }
        }


        test {
            id("test")
        }

        carousel {
            id("card_carousel")
            cardMap?.let{
                models(
                    it
                )
            }
        }

    }
}