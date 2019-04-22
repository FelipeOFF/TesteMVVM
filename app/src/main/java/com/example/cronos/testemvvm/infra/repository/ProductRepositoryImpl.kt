package com.example.cronos.testemvvm.infra.repository

import androidx.lifecycle.LiveData
import com.example.cronos.testemvvm.infra.local.dataset.ProductDataSet
import com.example.cronos.testemvvm.infra.local.db.entity.Product
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productDataSet: ProductDataSet
) : ProductRepository {
    override fun insert(product: Product) =
        productDataSet.insert(product)

    override fun deleteAll() =
        productDataSet.deleteAll()

    override fun getAllProductsById(): LiveData<List<Product>> =
        productDataSet.getAllProductsById()

    override fun update(product: Product) =
        productDataSet.update(product)

    override fun delete(product: Product) =
        productDataSet.delete(product)
}