package br.com.raphaelframos.countries.di

import br.com.raphaelframos.countries.repository.CountryRepository
import br.com.raphaelframos.countries.repository.CountryRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    factory { CountryRepositoryImpl(get()) as CountryRepository }
}