package com.thechance.randomdicegenerator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thechance.randomdicegenerator.model.NumberGenerator

class MainViewModel:ViewModel() {
    private val numberGenerator = NumberGenerator()

    private val _diceNumber = MutableLiveData<Int>()
    val diceNumber :LiveData<Int>
        get() = _diceNumber


    fun getRollDiceNumber(){
        _diceNumber.postValue(numberGenerator.getRollDiceNumber())

    }
}