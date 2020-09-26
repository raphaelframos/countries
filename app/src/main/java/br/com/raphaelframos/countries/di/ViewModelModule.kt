package br.com.raphaelframos.countries.di

import br.com.raphaelframos.countries.viewmodel.CountryViewModel
import org.koin.dsl.module

val viewModel = module {
    single { CountryViewModel(get()) }
}