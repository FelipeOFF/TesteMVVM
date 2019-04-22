package com.example.cronos.testemvvm.di.module.local.db.dao

import com.example.cronos.testemvvm.di.ProductDB
import com.example.cronos.testemvvm.infra.local.db.ProductDataBase
import com.example.cronos.testemvvm.infra.local.db.dao.ProductDao
import dagger.Module
import dagger.Provides


@Module
class DaoModule {

    @Provides
    fun providesProductDao(@ProductDB productDB: ProductDataBase): ProductDao =
            productDB.productDao()

}