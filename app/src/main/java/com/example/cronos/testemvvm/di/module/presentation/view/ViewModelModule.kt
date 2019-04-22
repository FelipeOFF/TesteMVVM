package com.example.cronos.testemvvm.di.module.presentation.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cronos.testemvvm.domain.interector.GetAllProductsByIdInterector
import com.example.cronos.testemvvm.domain.interector.GetAllProductsByIdInterectorImpl
import com.example.cronos.testemvvm.presentation.view.model.MainFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindsGetAllProductsByIdInterector(impl: GetAllProductsByIdInterectorImpl): GetAllProductsByIdInterector

    @Binds
    @IntoMap
    @ViewModelKey(MainFragmentViewModel::class)
    abstract fun bindMainFragmentViewModel(listViewModel: MainFragmentViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}