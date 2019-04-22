package com.example.cronos.testemvvm.domain.interector

import com.example.cronos.testemvvm.domain.mapper.ProductMapper
import com.example.cronos.testemvvm.domain.utils.withExecutor
import com.example.cronos.testemvvm.infra.repository.ProductRepository
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import io.reactivex.Completable
import javax.inject.Inject

interface InsertProductInterector : Interector<ProductViewModel, Completable>

class InsertProductInterectorImpl @Inject constructor(
    private val productRepository: ProductRepository,
    private val productMapper: ProductMapper
) : InsertProductInterector {
    override fun execute(param: ProductViewModel): Completable = Completable.create {
        try {
            productRepository.insert(productMapper.mapperToInfra(param))
            it.onComplete()
        } catch (e: Exception) {
            it.onError(e)
        }
    }.withExecutor()
}