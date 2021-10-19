package com.thechance.randomdicegenerator.model

class NumberGenerator {
    private val startValue = 1
    private val endValue = 6
    fun getRollDiceNumber(): Int {
        return (startValue..endValue).random()
    }
}