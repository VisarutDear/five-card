package com.visarut.fivecard

import android.app.Application
import com.visarut.fivecard.data.di.deckModule
import com.visarut.fivecard.domain.di.useCaseModule
import com.visarut.fivecard.view.feature.featurePlay.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(deckModule, useCaseModule, viewModelModule))
        }
    }
}