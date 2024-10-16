

fun main(){

    /*var list = (1..20).toList()
    println(list)
    // it = each item from the list
    list = list.filter { it % 2 == 0 }
    println(list)
    */

    /*
    val circle1 = Circle(5.0)
    val circle2 = Circle(7.3)
    val triangle1 = Triangle(7.0, 7.0,8.5)
    val triangle2 = Triangle(9.0, 7.5,5.5)
    val rectangle1 = Rectangle(10.0, 10.0)
    val rectangle2 = Rectangle(7.0, 9.5)

    var shapes = listOf<Shape>(circle1, circle2, triangle1, triangle2, rectangle1,rectangle2)
    shapes = shapes.customFilter { it.area() > 50 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name} Area =  ${shape.area()}")
    }
    */

    var list = (1..10).toList()
    val sum = list.customSum { it % 2 == 1 }
    println("The sum is: $sum")

    var integer = (1..10).toList().customGenericFilter { it > 5 }
    var triple = Triple(3,"hello",true)
    var customTriple = CustomTriple<Int,String,Boolean>(82,"hello",false)
    customTriple.printTypes()

}
/*
1 - List<Int> = Type the extension function will be applied to
2 - customSum = name of the extension function
3 - (sumFunction: (Int) -> (Boolean)) = definition of the lambda function, it will receive a parameter of type Int, test it and return the Boolean result, if true the code will be executed with the number in question
*/
fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int{
    var resultSum = 0
    for (number in this) {
        if (sumFunction(number)) {
            resultSum += number
        }
    }
    return resultSum


}

fun List<Shape>.customFilter(filterFuntion: (Shape) -> (Boolean)): List<Shape>{
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFuntion(shape)) {
            resultList.add(shape)
        }
    }
    return resultList

}

//Generics - T refers to any type of class
fun <T> List<T>.customGenericFilter(filterFuntion: (T) -> (Boolean)): List<T>{
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFuntion(item)) {
            resultList.add(item)
        }
    }
    return resultList
}