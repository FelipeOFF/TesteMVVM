package com.example.cronos.testemvvm.di.module.repository

import com.example.cronos.testemvvm.infrastructure.repository.ProductRepository
import com.example.cronos.testemvvm.infrastructure.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindsProduct(impl: ProductRepositoryImpl): ProductRepository

}