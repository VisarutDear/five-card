package com.visarut.fivecard.data.di

import com.visarut.fivecard.data.repository.DeckRepository
import com.visarut.fivecard.data.repository.DeckRepositoryImpl
import org.koin.dsl.module

val deckModule = module {

    factory<DeckRepository> { DeckRepositoryImpl() }
}