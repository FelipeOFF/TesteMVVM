package com.example.cronos.testemvvm.domain.interector

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.cronos.testemvvm.domain.mapper.ProductMapper
import com.example.cronos.testemvvm.infrastructure.repository.ProductRepository
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import javax.inject.Inject

interface GetAllProductsByIdInterector : Interector<Unit, LiveData<List<ProductViewModel>>>

class GetAllProductsByIdInterectorImpl @Inject constructor(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : GetAllProductsByIdInterector {
    override fun execute(param: Unit): LiveData<List<ProductViewModel>> =
        Transformations.map(productRepository.getAllProductsById()) { input ->
            input.map { productMapper.mapperToPresentation(it) }
        }
}