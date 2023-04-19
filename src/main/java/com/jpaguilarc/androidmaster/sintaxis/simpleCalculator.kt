package com.jpaguilarc.androidmaster

val firstValue = 14
val secondValue = 17

fun main() {
    var getAdd = add(firstValue, secondValue)
    println("the addition op yields $getAdd")

    var getSubstract = substract(firstValue, secondValue)
    println("the substract op yields $getSubstract")

    var getMult = multiply(firstValue, secondValue)
    println("the multiply op yields $getMult")

    var getDiv = divide(firstValue, secondValue)
    println("the divition op yields $getDiv")
}

fun add(num1:Int, num2:Int): Int{
    return num1 + num2
}

fun substract(num1:Int, num2:Int): Int{
    return num1 - num2
}

fun multiply(num1:Int, num2:Int): Int{
    return num1 * num2
}

fun divide(num1:Int, num2:Int): Int{
    return (num1 / num2).toInt()
}