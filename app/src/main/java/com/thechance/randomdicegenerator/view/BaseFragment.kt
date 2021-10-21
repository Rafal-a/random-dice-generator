package com.thechance.randomdicegenerator.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB:ViewDataBinding>(private val  layoutId:Int):Fragment() {
    private lateinit var _binding :ViewDataBinding
     var binding: VB?
     get()=_binding as VB?
    set(value) = TODO()

    abstract  val bindingInflater:(LayoutInflater, Int ,ViewGroup? , Boolean )->VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = bindingInflater(inflater , layoutId , container , false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }
    abstract fun setup()
}
