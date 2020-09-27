package br.com.raphaelframos.countries

import android.app.Application
import br.com.raphaelframos.countries.di.apiModule
import br.com.raphaelframos.countries.di.repositoryModule
import br.com.raphaelframos.countries.di.viewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@BaseApplication)
            modules(listOf(apiModule, repositoryModule, viewModel))
        }
    }
}