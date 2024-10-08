

fun main() {
   /* println("Please enter a number")
    val input = readLine()?.toInt()
    if (input != null) {
        println(input.isPrime())
    }*/

    val list = listOf(1,2,3,4,5,6)
    val product = list.productOfList()
    println("The product of $list is $product")

}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}
//Exercise 1
fun List<Int>.productOfList():Int{
    var product = this[0]
    for (number in this + 1) {
        product *= number
    }
    return product
}