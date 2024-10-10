import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
): Shape("Triangle") {


    init {
        println("$name created with a = $a, b = $b and c = $c")
        println("$name area is: ${area()}")
        println("$name perimeter is: ${perimeter()}")
    }

    override fun perimeter(): Double = a + b + c

    override fun area(): Double {
        val semiPerimeter = perimeter()/2
        val area = sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))
        return area
    }
}