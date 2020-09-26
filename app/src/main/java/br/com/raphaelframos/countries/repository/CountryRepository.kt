package br.com.raphaelframos.countries.repository

import br.com.raphaelframos.countries.model.Country

interface CountryRepository {

    suspend fun getAll() : List<Country>
}