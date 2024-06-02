package com.example.pokedexapp.app.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedexapp.R
import com.example.pokedexapp.databinding.ActivityMainBinding
import com.skydoves.bindables.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main)  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}