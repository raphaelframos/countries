package br.com.raphaelframos.countries.model

import com.google.gson.annotations.SerializedName

data class Country(@SerializedName("name") val name: String,
                   @SerializedName("alpha3Code") val code: String,
                   @SerializedName("capital") val capital: String,
                   @SerializedName("region") val region: String,
                   @SerializedName("flag") val flag: String,
                   @SerializedName("subregion") val subregion: String)