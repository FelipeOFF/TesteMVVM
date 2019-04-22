package com.example.cronos.testemvvm.presentation.view.model

import androidx.lifecycle.MutableLiveData
import com.example.cronos.testemvvm.R
import com.example.cronos.testemvvm.presentation.view.BaseViewModel

class ErrorViewModel : BaseViewModel() {

    val observableInt = MutableLiveData<Int>()

    fun handleThrowable(throwable: Throwable) {
        observableInt.value = R.string.error_unespliqued
    }

}