

fun main() {
    /*val array = intArrayOf(23,33,46)
    //Vararg allows to pass an entire array inside another existing sequence os parameters using the * (spread) operator, each value contained within the array will be placed in sequence
    val max = getMax(1,25,8,16,*array,5,8,15,4,9)
    println(max)*/

    /*searchFor("How to become a good programmer")
    //It's possible to call the name of the paramater to assign a value to it despite it's order
    searchFor(searchEngine = "Bing",search = "How to become the best Kotlin programmer")*/

    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum is $sum")


}
//Vararg: variable number of argument, type of parameter that behaves similarly to an array and allows a sequence of arguments to be passed
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}
//searchEngine has a default value that will always be used unless a new value it's passed to it on function call
fun searchFor(search:String,searchEngine:String = "Google"){
    println("Searching for $search on $searchEngine")
}

//Exercise 1 - Easy
fun alternatingSum(vararg numbers: Int):Int {
    var sum = 0
    for (number in numbers) {
        val numberIndex = numbers.indexOf(number)
        if (numberIndex % 2 == 0) {
            sum += number
        }else{
            sum -= number
        }
    }
    return sum
}