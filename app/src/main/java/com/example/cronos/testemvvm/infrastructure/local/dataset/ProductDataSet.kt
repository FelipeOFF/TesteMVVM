package com.example.cronos.testemvvm.infrastructure.local.dataset

import androidx.lifecycle.LiveData
import com.example.cronos.testemvvm.infrastructure.local.db.entity.Product

interface ProductDataSet {
    fun insert(product: Product)
    fun deleteAll()
    fun getAllProductsById(): LiveData<List<Product>>
    fun update(product: Product)
    fun delete(product: Product)
}