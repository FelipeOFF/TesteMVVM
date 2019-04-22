package com.example.cronos.testemvvm.di.module.domain.mapper

import com.example.cronos.testemvvm.domain.mapper.ProductMapper
import com.example.cronos.testemvvm.domain.mapper.ProductMapperImpl
import dagger.Binds
import dagger.Module

@Module
abstract class MapperModule {

    @Binds
    abstract fun bindsProductMapper(impl: ProductMapperImpl): ProductMapper

}