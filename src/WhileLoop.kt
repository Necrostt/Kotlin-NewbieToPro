

fun main(){
    //Exercise 2 - Hard
    println("Enter number 1")
    val num1 = readLine()?.toInt()
    println("Enter number 2")
    val num2 = readLine()?.toInt()
    var powerResult = num1

    if (num1 != null && num2 != null) {
        var powerResult = num1
        var acc: Int = 0

        var i = 1
        while (i < num2) {
            if (powerResult != null) {
                acc = powerResult
            }
            powerResult = acc * num1
            println(powerResult)
            i++
        }
        println("$num1 to the power of $num2 is $powerResult")
    }





//Exercise 1 - Easy
    /*println("Please enter a number:")
    var userNumber = readLine()?.toInt()
    if (userNumber!=null) {
        println("Let's count from $userNumber to 0:")
        while (userNumber >= 0) {
            println(userNumber)
            userNumber--
        }
    }*/



//    val myArray = arrayOf("Hello","guys","what's up?")
//    var i = 0
//    while (i < myArray.size) {
//        println(myArray[i] + " ")
//        i++
//    }

//    var x = 5
//    while (x > 0) {
//        println("hello")
//        x--
//    }


}