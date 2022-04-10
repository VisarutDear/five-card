package com.visarut.fivecard.view.feature.featurePlay.di

import com.visarut.fivecard.view.feature.featurePlay.PlayFramgentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        PlayFramgentViewModel(get(), get())
    }
}