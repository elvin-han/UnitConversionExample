package kr.elvin.unitconversionexample

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class Time(name: String, ratio: Double): Unit(name, ratio) {
    companion object Factory {
        val Second = Time("Second", 1.0)
        val Minute = Time("Minute", 60.0)
    }
}