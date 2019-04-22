package com.example.cronos.testemvvm.di.module.dataset

import com.example.cronos.testemvvm.infra.local.dataset.ProductDataSet
import com.example.cronos.testemvvm.infra.local.db.dao.ProductDataSetImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DataSetModule {

    @Binds
    abstract fun bindsProductDataset(impl: ProductDataSetImpl): ProductDataSet

}