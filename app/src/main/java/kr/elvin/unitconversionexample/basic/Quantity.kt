package kr.elvin.unitconversionexample.basic

import kr.elvin.unitconversionexample.Unit

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class Quantity(val amount: Double, val unit: Unit) {
    fun convert(unit: Unit): Quantity {
        val baseUnit = this.unit.convertToBaseUnit(amount)
        return Quantity(unit.convertFromBaseUnit(baseUnit), unit)
    }
}