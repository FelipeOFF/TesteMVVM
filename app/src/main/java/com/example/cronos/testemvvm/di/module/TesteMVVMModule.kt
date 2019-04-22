package com.example.cronos.testemvvm.di.module

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.cronos.testemvvm.di.ApplicationContext
import com.example.cronos.testemvvm.di.ProductDB
import com.example.cronos.testemvvm.di.module.presentation.view.ViewModelModule
import com.example.cronos.testemvvm.infra.local.db.ProductDataBase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [
    ViewModelModule::class
])
class TesteMVVMModule{

    @Provides
    @Singleton
    @ApplicationContext
    fun providesContext(application: Application) : Context = application.applicationContext

    @Provides
    @Singleton
    @ProductDB
    fun providesProductDatabase(@ApplicationContext context: Context): ProductDataBase =
            Room.databaseBuilder(context, ProductDataBase::class.java, "product_database").build()

}