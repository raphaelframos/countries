package br.com.raphaelframos.countries.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.raphaelframos.countries.model.Country
import br.com.raphaelframos.countries.repository.CountryRepository
import kotlinx.coroutines.launch

class CountryViewModel(private val repository: CountryRepository) : ViewModel() {

    private val _countries = MutableLiveData<List<Country>>()
    val countries : LiveData<List<Country>> = _countries

    init {
        getAllCountries()
    }

     fun getAllCountries(){
         viewModelScope.launch {
             _countries.value = repository.getAll()
         }

    }
}