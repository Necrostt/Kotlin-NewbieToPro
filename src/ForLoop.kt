


fun main(){

    val myArray = mutableListOf<Int>()
    var avg = 0.0
    var userInput: Int? = 0
    //Exercise 2 - Hard
    println("enter 5 numbers")
    for (i in 0..4) {
        userInput = readLine()?.toInt()
        if (userInput != null) {
            avg += userInput/5.0
        }
    }
    //reduce - define an accumulator and the element of the array to be used in operation -> define the operation
    //avg = (myArray.reduce { acc, element -> acc + element } / 5).toFloat()
    println("media: $avg")


    //Exercise 1 - Easy
    /*for (i in myArray.indices) {
        sum += myArray[i]
    }
    println("The sum of the array is: $sum")*/

   /* var max = myArray[0]
    for (i in myArray) {
        if (i > max) {
            max = i
        }
    }
    println(max)*/


   /* for (i in 5 downTo 0) {
        println(i)
    }*/

   /* for (i in 1..3) {
        println(i)
    }*/

    /*val myArray = arrayOf(1,2,3)
    for (i in myArray) {
        println(i)
    }*/


}