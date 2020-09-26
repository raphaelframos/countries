package br.com.raphaelframos.countries.ws

import retrofit2.http.GET

interface CountriesApi {

    @GET("all")
    suspend fun getAll()
}