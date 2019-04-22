package com.example.cronos.testemvvm.presentation.utils

import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection

fun AppCompatActivity.inject() {
    AndroidInjection.inject(this)
}