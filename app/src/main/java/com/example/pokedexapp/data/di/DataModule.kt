package com.example.pokedexapp.data.di

import com.example.pokedexapp.data.repository.MainRepository
import com.example.pokedexapp.data.repository.MainRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {

    @Binds
    fun bindsMainRepository(mainRepositoryImpl: MainRepositoryImpl): MainRepository
}