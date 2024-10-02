


fun main(){

    var myArray = mutableListOf<Int>()
    var sum = 0
    var avg = 0f
    var userInput: Int? = 0
    //Exercise 2 - Hard
    println("enter 5 numbers")
    for (i in 0..4) {
        userInput = readLine()?.toInt()
        if (userInput != null) {
            myArray.add(userInput)
        }
    }
    avg = (myArray.reduce { acc, element -> acc + element } / myArray.size).toFloat()
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