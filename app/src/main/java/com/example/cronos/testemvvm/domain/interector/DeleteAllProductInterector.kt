package com.example.cronos.testemvvm.domain.interector

import com.example.cronos.testemvvm.domain.utils.withExecutor
import com.example.cronos.testemvvm.infra.repository.ProductRepository
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import io.reactivex.Completable
import javax.inject.Inject

interface DeleteAllProductInterector : Interector<ProductViewModel, Completable>

class DeleteAllProductInterectorImpl @Inject constructor(
    private val productRepository: ProductRepository
) : DeleteAllProductInterector {
    override fun execute(param: ProductViewModel): Completable = Completable.create {
        try {
            productRepository.deleteAll()
            it.onComplete()
        }catch (e: Exception) {
            it.onError(e)
        }
    }.withExecutor()
}
