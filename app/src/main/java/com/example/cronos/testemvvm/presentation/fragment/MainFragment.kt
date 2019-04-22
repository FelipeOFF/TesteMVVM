package com.example.cronos.testemvvm.presentation.fragment

import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cronos.testemvvm.R
import com.example.cronos.testemvvm.databinding.FragmentMainBinding
import com.example.cronos.testemvvm.di.module.presentation.view.ViewModelFactory
import com.example.cronos.testemvvm.presentation.adapter.ProductAdapter
import com.example.cronos.testemvvm.presentation.utils.navigate
import com.example.cronos.testemvvm.presentation.view.model.MainFragmentViewModel
import com.example.cronos.testemvvm.presentation.view.model.persistence.ProductViewModel
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding, MainFragmentViewModel>() {

    @Inject lateinit var viewModelFactory: ViewModelFactory

    override fun getBindingVariable(): Int = BR.mainFragmentViewModel

    override fun getLayoutId(): Int = R.layout.fragment_main

    override fun getViewModel(): MainFragmentViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainFragmentViewModel::class.java)

    override fun initBinding() {
        with(binding) {
            setupMenu()
            recyclerProducts.adapter = ProductAdapter(emptyArray<ProductViewModel>().toMutableList()) {

            }
            recyclerProducts.layoutManager = LinearLayoutManager(context)
        }
    }

    private fun FragmentMainBinding.setupMenu() {
        toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.add -> {
                    navigate(MainFragmentDirections.actionMainFragmentToEditFragment())
                    true
                }
                else -> false
            }
        }
    }
}