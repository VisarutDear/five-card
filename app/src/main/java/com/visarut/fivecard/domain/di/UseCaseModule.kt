package com.visarut.fivecard.domain.di

import com.visarut.fivecard.domain.usecase.GetRandomCardUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single {
        GetRandomCardUseCase(get())
    }
}