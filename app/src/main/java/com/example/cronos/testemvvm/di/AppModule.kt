package com.example.cronos.testemvvm.di

import com.example.cronos.testemvvm.di.module.presentation.activity.MainActivityModule
import com.example.cronos.testemvvm.di.module.presentation.fragment.EditFragmentModule
import com.example.cronos.testemvvm.di.module.presentation.fragment.MainFragmentModule
import com.example.cronos.testemvvm.presentation.activity.MainActivity
import com.example.cronos.testemvvm.presentation.fragment.EditFragment
import com.example.cronos.testemvvm.presentation.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun buildMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun buildMainFragment(): MainFragment

    @ContributesAndroidInjector(modules = [EditFragmentModule::class])
    abstract fun buildEditFragment(): EditFragment


}