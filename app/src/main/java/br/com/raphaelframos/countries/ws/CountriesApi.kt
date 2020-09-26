package br.com.raphaelframos.countries.ws

import br.com.raphaelframos.countries.model.Country
import retrofit2.http.GET

interface CountriesApi {

    @GET("all")
    suspend fun getAll() : List<Country>
}