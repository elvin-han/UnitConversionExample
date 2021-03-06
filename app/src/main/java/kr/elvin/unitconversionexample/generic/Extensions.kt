import kr.elvin.unitconversionexample.Distance
import kr.elvin.unitconversionexample.generic.Quantity

val Quantity<Distance>.miles get() = this.to(Distance.Mile)
val Quantity<Distance>.killometer get() = this.to(Distance.Kilometer)
val Quantity<Distance>.meters get() = this.to(Distance.Meter)
val Quantity<Distance>.centimeters get() = this.to(Distance.Centimeter)
val Quantity<Distance>.millimeters get() = this.to(Distance.Millimeter)

val Number.meters: Quantity<Distance> get() = Quantity(this.toDouble(), Distance.Meter)
val Number.kilometers: Quantity<Distance> get() = Quantity(this.toDouble(), Distance.Kilometer)
val Number.miles: Quantity<Distance> get() = Quantity(this.toDouble(), Distance.Mile)
val Number.centimeter: Quantity<Distance> get() = Quantity(this.toDouble(), Distance.Centimeter)
val Number.millimeter: Quantity<Distance> get() = Quantity(this.toDouble(), Distance.Millimeter)
