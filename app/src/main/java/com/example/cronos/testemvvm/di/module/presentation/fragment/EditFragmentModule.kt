package com.example.cronos.testemvvm.di.module.presentation.fragment

import com.example.cronos.testemvvm.domain.interector.GetAllProductsByIdInterector
import com.example.cronos.testemvvm.domain.interector.GetAllProductsByIdInterectorImpl
import com.example.cronos.testemvvm.domain.interector.InsertProductInterector
import com.example.cronos.testemvvm.domain.interector.InsertProductInterectorImpl
import dagger.Binds
import dagger.Module

@Module
abstract class EditFragmentModule {

    @Binds
    abstract fun bindsInsertProduct(impl: InsertProductInterectorImpl): InsertProductInterector

}