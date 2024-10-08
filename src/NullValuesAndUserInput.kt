

fun main() {
    val userInput = readLine()
    if (userInput != null)
    if (userInput.toInt() < 18) {
        println("Your are not an adult")
    }else if (userInput.toInt() in 18..64) {
        print("You are an adult")
    } else {
        println("Your are very very old")
    }



    //println("You entered: ${userInput?.uppercase()}")

//    println(userInput.toInt() - 5)
}