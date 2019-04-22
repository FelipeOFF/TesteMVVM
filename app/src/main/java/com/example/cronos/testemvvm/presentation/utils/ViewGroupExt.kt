package com.example.cronos.testemvvm.presentation.utils

import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(idLayout: Int) =
        LayoutInflater.from(context).inflate(idLayout, this, false)