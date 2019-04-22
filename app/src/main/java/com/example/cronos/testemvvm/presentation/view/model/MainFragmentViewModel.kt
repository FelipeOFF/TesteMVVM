package com.example.cronos.testemvvm.presentation.view.model

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import com.example.cronos.testemvvm.domain.interector.GetAllProductsByIdInterector
import com.example.cronos.testemvvm.presentation.view.BaseViewModel
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import javax.inject.Inject

class MainFragmentViewModel @Inject constructor(
    getAllProductsByIdInterector: GetAllProductsByIdInterector
) : BaseViewModel() {

    val products: LiveData<List<ProductViewModel>> = getAllProductsByIdInterector.execute(Unit)
}