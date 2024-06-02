package com.example.pokedexapp.data.repository

import androidx.annotation.WorkerThread
import com.example.pokedexapp.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    @WorkerThread
    fun fetchPokemonList(
        page: Int,
        onStart: () -> Unit,
        onComplete: () -> Unit,
        onError: (String?) -> Unit,
    ): Flow<List<Pokemon>>
}