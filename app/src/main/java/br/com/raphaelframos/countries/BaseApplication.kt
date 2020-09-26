package br.com.raphaelframos.countries

import android.app.Application
import br.com.raphaelframos.countries.di.appModule
import org.koin.android.ext.android.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule))
    }
}