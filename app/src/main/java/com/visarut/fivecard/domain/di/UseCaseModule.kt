package com.visarut.fivecard.domain.di

import com.visarut.fivecard.domain.usecase.GetRandomCardUseCase
import com.visarut.fivecard.domain.usecase.GetTwoCardUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single {
        GetRandomCardUseCase(get())
    }

    single {
        GetTwoCardUseCase(get())
    }
}