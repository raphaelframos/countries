package br.com.raphaelframos.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import br.com.raphaelframos.countries.viewmodel.CountryViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity() {

    val countryViewModel : CountryViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryViewModel.countries.observe(this, Observer {
            Toast.makeText(applicationContext, "Paises: " + it, Toast.LENGTH_LONG).show()
        })
    }
}