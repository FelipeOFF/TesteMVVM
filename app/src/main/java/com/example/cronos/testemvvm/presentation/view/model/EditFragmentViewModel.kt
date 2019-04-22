package com.example.cronos.testemvvm.presentation.view.model

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import com.example.cronos.testemvvm.domain.utils.toMoney
import com.example.cronos.testemvvm.presentation.view.BaseViewModel
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel

class EditFragmentViewModel : BaseViewModel() {

    val productName = MutableLiveData<String>()

    val productValue = MutableLiveData<String>()

    fun setProduct(productViewModel: ProductViewModel) {
        productName.value = productViewModel.name
        productValue.value = productViewModel.value.toString()
    }
}