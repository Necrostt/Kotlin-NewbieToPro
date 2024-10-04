

fun main (){

   // sumFunction(1,5)
    val list = listOf(3,2,5,1,6,9,7)
    val result = listSearch(list)
    println(result)

}

fun sumFunction(rangeStart: Int, rangeEnd: Int){
    var result = 0
    for(i in rangeStart..rangeEnd){
        result += i
    }
    println("The sum of the values from $rangeStart to $rangeEnd is $result")
}

fun listSearch(list: List<Int>): String{
    println("The list looks like following: ${list.joinToString()}")
    println("Search for this number:")
    val search = readLine()?.toInt()
    if (search != null) {
        if (list.contains(search)) {
            return "The index of $search is ${list.indexOf(search)}"
        } else {
            return "The index of $search is -1"
        }
    }
    return "null"
}