package br.com.raphaelframos.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.raphaelframos.countries.adapter.CountryAdapter
import br.com.raphaelframos.countries.databinding.ActivityMainBinding
import br.com.raphaelframos.countries.viewmodel.CountryViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    private val countryViewModel : CountryViewModel by viewModel()
    private val adapter = CountryAdapter()
    private lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        initRecyclerView()
        initViewModel()
        setContentView(viewBinding.root)

    }

    private fun initRecyclerView() {
        viewBinding.recyclerViewCountries.layoutManager = LinearLayoutManager(this)
        viewBinding.recyclerViewCountries.adapter = adapter
    }

    private fun initViewModel() {
        countryViewModel.countries.observe(this, Observer {
            adapter.update(it)
        })
    }
}