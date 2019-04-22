package com.example.cronos.testemvvm.di.module.repository

import com.example.cronos.testemvvm.infra.repository.ProductRepository
import com.example.cronos.testemvvm.infra.repository.ProductRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindsProduct(impl: ProductRepositoryImpl): ProductRepository

}