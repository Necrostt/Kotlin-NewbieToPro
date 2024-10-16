import kotlin.math.sqrt
import kotlin.random.Random

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
): Shape("Triangle") {

    companion object {
        fun randomTriangle(): Triangle {
            val a = Random.nextDouble(5.0,15.0)
            val b = Random.nextDouble(5.0,15.0)
            val c = Random.nextDouble(5.0,15.0)
            return Triangle(a,b,c)
        }
    }

    init {
        println("$name created with a = $a, b = $b and c = $c")
        println("$name area is: ${String.format("%.2f",area())}")
        println("$name perimeter is: ${perimeter()}")
    }

    override fun perimeter(): Double = a + b + c

    override fun area(): Double {
        val semiPerimeter = perimeter()/2
        val area = sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c))
        return area
    }
}