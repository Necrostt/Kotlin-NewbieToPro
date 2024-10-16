

fun main(){

    val a = 4.0
    val b = 6.0
    val base1 = 5.0
    val base2 = 4.5
    val side1 = 6.0
    val side2 = 7.0
    val height = 5.0

    val parallelogram = object: Shape("Parallelogram",a,b,height){

        init {
            println("Parallelogram created with a = $a, b = $b and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b
    }

    val trapezoid = object: Shape("Trapezoid", base1, base2, side1, side2, height){

        init {
            println("Trapezoid created with base1 = $base1, base2 = $base2, side1 = $side1, side2 = $side2 and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double  = height * ((base1 + base2) / 2)

        override fun perimeter(): Double = base1 + base2 + side1 + side2

        fun isRectangle(): Boolean = height == b
    }

    println("Is the Trapezoid a rectangle? ${trapezoid.isRectangle()}")


}