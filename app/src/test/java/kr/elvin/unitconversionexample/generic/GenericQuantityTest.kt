package kr.elvin.unitconversionexample.generic

import killometer
import kilometers
import kr.elvin.unitconversionexample.Distance
import meters
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
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

    @Test
    fun `mile to second`() {
        val tenMiles = Quantity(10.0, Distance.Mile)

        // compile error
//        val seconds = tenMiles.to(Time.Second)
    }

    @Test
    fun `quantity extensions`() {
        val tenMiles = Quantity(10.0, Distance.Mile)
        val kilometers = tenMiles.killometer

        assertTrue(kilometers is Quantity<Distance>)
        assertEquals(Distance.Kilometer, kilometers.unit)
        assertEquals(16.09344, kilometers.amount, 0.0)
    }

    @Test
    fun `number extensions`() {
        val kilometers = 10.kilometers

        assertTrue(kilometers is Quantity<Distance>)
        assertEquals(Distance.Kilometer, kilometers.unit)
        assertEquals(10.0, kilometers.amount, 0.0)
    }

    @Test
    fun `operator overloading`() {
        val distance = 10.kilometers + 500.meters

        assertTrue(distance is Quantity<Distance>)
        assertEquals(Distance.Kilometer, distance.unit)
        assertEquals(10.5, distance.amount, 0.0)
    }
}
