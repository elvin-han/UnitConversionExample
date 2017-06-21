package kr.elvin.unitconversionexample.generic

import kilometers
import kr.elvin.unitconversionexample.Distance
import meters
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class GenericQuantityTest {
    @Test
    fun `mile to kilometer`() {
        val tenMiles = Quantity(10.0, Distance.Mile)
        val kilometers = tenMiles.to(Distance.Kilometer)

        assertEquals(16.09344, kilometers.amount, 0.0)
    }

//    @Test
//    fun `mile to second`() {
//        val tenMiles = Quantity(10.0, Distance.Mile)
//
//        // compile error
////        val seconds = tenMiles.convert(Time.Second)
//    }

    @Test
    fun extensions() {
        val totalDistance = 10.kilometers + 500.meters

        assertEquals(10.5, totalDistance.amount, 0.0)
    }
}
