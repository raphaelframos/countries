package br.com.raphaelframos.countries.model

import com.google.gson.annotations.SerializedName

data class Country(@SerializedName("name") val name: String,
                   @SerializedName("") val uf: String
) {
}