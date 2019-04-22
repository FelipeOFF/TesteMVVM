package com.example.cronos.testemvvm.domain.interector

interface Interector<in PARAM, out RESPONSE> {
    fun execute(param: PARAM): RESPONSE
}