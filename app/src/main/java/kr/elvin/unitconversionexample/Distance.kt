package kr.elvin.unitconversionexample

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class Distance(name: String, ratio: Double): Unit(name, ratio) {
    companion object Factory {
        val Mile = Distance("Mile", 1609.344)
        val Kilometer = Distance("Kilometer", 1000.0)
        val Meter = Distance("Meter", 1.0)
        val Centimeter = Distance("Centimeter", 0.01)
        val Millimeter = Distance("Millimeter", 0.001)
    }

}