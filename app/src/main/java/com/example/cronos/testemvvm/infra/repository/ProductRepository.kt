package com.example.cronos.testemvvm.infra.repository

import androidx.lifecycle.LiveData
import com.example.cronos.testemvvm.infra.local.db.entity.Product

interface ProductRepository {
    fun insert(product: Product)
    fun deleteAll()
    fun getAllProductsById(): LiveData<List<Product>>
    fun update(product: Product)
    fun delete(product: Product)
}