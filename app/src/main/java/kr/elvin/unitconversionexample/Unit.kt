package kr.elvin.unitconversionexample

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
open class Unit(val name: String, val ratio: Double) {
    fun convertToBaseUnit(amount: Double) = amount * ratio
    fun convertFromBaseUnit(amount: Double) = amount / ratio
}


