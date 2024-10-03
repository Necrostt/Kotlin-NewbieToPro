

fun main(){

    /* val array = arrayOf(1,2,3) // Values can be changed in runtime, but the size cannot be changed, meaning no more elements can be added to the array
    val list = listOf(1,2,3) // Values cannot be changed during runtime
    val mutableList = mutableListOf(1,2,3) // Values in a mutableList can also be changed during runtime, and it's size can be changed meaning it's possible to add more elements to the list
    */


    //Exercise 2 - Hard
    println("Enter a number n > 1")
    val fibonacciList = mutableListOf(0,1)
    val userInput = readLine()?.toInt()
    if (userInput != null){
        for (i in 2..< userInput) {
            fibonacciList.add(fibonacciList[fibonacciList.lastIndex] + fibonacciList[fibonacciList.lastIndex-1])
        }
        println(fibonacciList)

    }

    //Exercise 1 - Easy
   /* val list = mutableListOf<Int>()
    println("Enter 5 numbers")
    for (i in 1..5) {
        val userInput = readLine()?.toInt()
        if (userInput != null) list.add(userInput)
    }
    println("The 5 numbers in reverse order are:")
    for (i in list.indices.reversed()) {
        println(list[i])
    }*/


    /*val list = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if(x != null) list.add(x)
    }
    println(list)*/

}