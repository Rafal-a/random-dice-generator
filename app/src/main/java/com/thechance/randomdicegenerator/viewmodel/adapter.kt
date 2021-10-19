package com.thechance.randomdicegenerator.viewmodel

import android.view.View
import androidx.databinding.BindingAdapter
import com.thechance.randomdicegenerator.R

@BindingAdapter(value = ["diceRoll"])
fun changeSomething(view: View,value:Int){
    when(value){
        1 -> view.setBackgroundResource(R.drawable.ic_dice_1)
        2 -> view.setBackgroundResource(R.drawable.ic_dice_2)
        3 -> view.setBackgroundResource(R.drawable.ic_dice_3)
        4 -> view.setBackgroundResource(R.drawable.ic_dice_4)
        5 -> view.setBackgroundResource(R.drawable.ic_dice_5)
        6 -> view.setBackgroundResource(R.drawable.ic_dice_6)
}
}