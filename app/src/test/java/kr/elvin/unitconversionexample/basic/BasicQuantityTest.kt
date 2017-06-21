package kr.elvin.unitconversionexample.basic

import kr.elvin.unitconversionexample.Distance
import kr.elvin.unitconversionexample.Time
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by kyoung-hoonhan on 2017. 6. 21..
 */
class BasicQuantityTest {
    @Test
    fun `mile to kilometer`() {
        val tenMiles = Quantity(10.0, Distance.Mile)
        val kilometers = tenMiles.to(Distance.Kilometer)

        assertEquals(16.09344, kilometers.amount, 0.0)
    }

    @Test
    fun `mile to second`() {
        val tenMiles = Quantity(10.0, Distance.Mile)
        val seconds = tenMiles.to(Time.Second)

        fail("This wouldn't crash, create a warning or even fail to compile.")
    }
}