package br.com.raphaelframos.countries.repository

import br.com.raphaelframos.countries.ws.CountriesApi

class CountryRepositoryImpl(private val api: CountriesApi) : CountryRepository{

    override suspend fun getAll() = api.getAll()
}