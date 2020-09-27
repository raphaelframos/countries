package br.com.raphaelframos.countries.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.raphaelframos.countries.databinding.AdapterCountryBinding
import br.com.raphaelframos.countries.model.Country

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    private var countries : List<Country> = emptyList()

    class CountryViewHolder(private val viewBinding: AdapterCountryBinding) : RecyclerView.ViewHolder(viewBinding.root) {

        fun set(country: Country) {
            viewBinding.textViewName.text = country.name
            viewBinding.textViewRegion.text = country.region
            viewBinding.textViewSubregion.text = country.subregion
            viewBinding.textViewCode.text = country.code
            viewBinding.textViewCapital.text = country.capital
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = AdapterCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return countries.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.set(countries[position])
    }

    fun update(it: List<Country>) {
        this.countries = it
        notifyDataSetChanged()
    }
}