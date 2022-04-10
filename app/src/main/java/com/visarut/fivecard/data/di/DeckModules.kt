package com.visarut.fivecard.data.di

import com.visarut.fivecard.data.repository.DeckRepository
import com.visarut.fivecard.data.repository.DeckRepositoryImpl
import com.visarut.fivecard.data.repository.GameRepository
import com.visarut.fivecard.data.repository.GameRepositoryImpl
import org.koin.dsl.module

val deckModule = module {

    factory<DeckRepository> { DeckRepositoryImpl() }
    factory<GameRepository> { GameRepositoryImpl() }
}