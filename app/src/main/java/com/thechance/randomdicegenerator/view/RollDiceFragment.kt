package com.thechance.randomdicegenerator.view



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.thechance.randomdicegenerator.R
import com.thechance.randomdicegenerator.databinding.FragmentRollDiceBinding
import com.thechance.randomdicegenerator.viewmodel.MainViewModel


class RollDiceFragment : BaseFragment<FragmentRollDiceBinding>(R.layout.fragment_roll_dice){
    override val bindingInflater: (LayoutInflater, Int, ViewGroup?, Boolean)
    -> FragmentRollDiceBinding = DataBindingUtil::inflate
        //get() = FragmentRollDiceBinding
    private val viewModel:MainViewModel by viewModels()

    override fun setup() {
        binding?.apply {
            this.viewmodel = viewModel
            this.lifecycleOwner = viewLifecycleOwner
        }
    }

}