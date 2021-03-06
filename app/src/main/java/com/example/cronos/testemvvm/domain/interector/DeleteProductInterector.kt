package com.example.cronos.testemvvm.domain.interector

import com.example.cronos.testemvvm.domain.mapper.ProductMapper
import com.example.cronos.testemvvm.domain.utils.withExecutor
import com.example.cronos.testemvvm.infrastructure.repository.ProductRepository
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import io.reactivex.Completable
import javax.inject.Inject

interface DeleteProductInterector : Interector<ProductViewModel, Completable>

class DeleteProductInterectorImpl @Inject constructor(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : DeleteProductInterector {
    override fun execute(param: ProductViewModel): Completable = Completable.create {
        try {
            productRepository.delete(productMapper.mapperToInfra(param))
            it.onComplete()
        }catch (e: Exception) {
            it.onError(e)
        }
    }.withExecutor()
}