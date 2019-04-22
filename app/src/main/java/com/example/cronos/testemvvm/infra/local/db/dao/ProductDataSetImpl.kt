package com.example.cronos.testemvvm.infra.local.db.dao

import androidx.lifecycle.LiveData
import com.example.cronos.testemvvm.infra.local.dataset.ProductDataSet
import com.example.cronos.testemvvm.infra.local.db.entity.Product
import javax.inject.Inject

class ProductDataSetImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductDataSet {
    override fun insert(product: Product) =
        productDao.insert(product)

    override fun deleteAll() =
        productDao.deleteAll()

    override fun getAllProductsById(): LiveData<List<Product>> =
        productDao.getAllProductsByIds()

    override fun update(product: Product) =
        productDao.updateProduct(product)

    override fun delete(product: Product) =
            productDao.delete(product)
}