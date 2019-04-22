package com.example.cronos.testemvvm.di.component

import android.app.Application
import com.example.cronos.testemvvm.application.TesteMVVMApp
import com.example.cronos.testemvvm.di.AppModule
import com.example.cronos.testemvvm.di.module.TesteMVVMModule
import com.example.cronos.testemvvm.di.module.dataset.DataSetModule
import com.example.cronos.testemvvm.di.module.domain.mapper.MapperModule
import com.example.cronos.testemvvm.di.module.local.db.dao.DaoModule
import com.example.cronos.testemvvm.di.module.repository.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        TesteMVVMModule::class,
        DataSetModule::class,
        DaoModule::class,
        RepositoryModule::class,
        MapperModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<TesteMVVMApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

}