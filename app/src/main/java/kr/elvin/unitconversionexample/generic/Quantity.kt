package kr.elvin.unitconversionexample.generic

import kr.elvin.unitconversionexample.Unit

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class Quantity<T: Unit>(val amount: Double, val unit: T) {
    fun to(unit: T): Quantity<T> {
        val baseUnit = this.unit.convertToBaseUnit(amount)
        return Quantity(unit.convertFromBaseUnit(baseUnit), unit)
    }

    operator fun plus(quantity: Quantity<T>): Quantity<T> {
        val converted = quantity.to(this.unit).amount
        val amount = this.amount + converted
        return Quantity(amount, this.unit)
    }

    operator fun minus(quantity: Quantity<T>): Quantity<T> {
        val converted = quantity.to(this.unit).amount
        val amount = this.amount - converted
        return Quantity(amount, this.unit)
    }

    operator fun times(quantity: Quantity<T>): Quantity<T> {
        val converted = quantity.to(this.unit).amount
        val amount = this.amount / converted
        return Quantity(amount, this.unit)
    }

    operator fun div(quantity: Quantity<T>): Quantity<T> {
        val converted = quantity.to(this.unit).amount
        val amount = this.amount / converted
        return Quantity(amount, this.unit)
    }
}