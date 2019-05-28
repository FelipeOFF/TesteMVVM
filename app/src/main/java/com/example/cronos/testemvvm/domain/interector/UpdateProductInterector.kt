package com.example.cronos.testemvvm.domain.interector

import com.example.cronos.testemvvm.domain.mapper.ProductMapper
import com.example.cronos.testemvvm.domain.utils.withExecutor
import com.example.cronos.testemvvm.infrastructure.repository.ProductRepository
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import io.reactivex.Completable
import javax.inject.Inject

interface UpdateProductInterector : Interector<ProductViewModel, Completable>

class UpdateProductInterectorimpl @Inject constructor(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : UpdateProductInterector {
    override fun execute(param: ProductViewModel): Completable = Completable.create {
        try {
            productRepository.update(productMapper.mapperToInfra(param))
            it.onComplete()
        }catch (e: Exception) {
            it.onError(e)
        }
    }.withExecutor()
}