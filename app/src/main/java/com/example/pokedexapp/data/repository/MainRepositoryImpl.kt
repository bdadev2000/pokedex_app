package com.example.pokedexapp.data.repository

import androidx.annotation.VisibleForTesting
import androidx.annotation.WorkerThread
import com.example.pokedexapp.database.PokemonDao
import com.example.pokedexapp.model.Pokemon
import com.example.pokedexapp.network.Dispatcher
import com.example.pokedexapp.network.PokedexAppDispatchers
import com.example.pokedexapp.network.service.PokedexClient
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.message
import com.skydoves.sandwich.onFailure
import com.skydoves.sandwich.suspendOnSuccess
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@VisibleForTesting
class MainRepositoryImpl @Inject constructor(
    private val pokedexClient: PokedexClient,
    private val pokemonDao: PokemonDao,
    @Dispatcher(PokedexAppDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
) : MainRepository {
    override fun fetchPokemonList(
        page: Int,
        onStart: () -> Unit,
        onComplete: () -> Unit,
        onError: (String?) -> Unit
    ): Flow<List<Pokemon>> {
        return  flow {}
    }
}
