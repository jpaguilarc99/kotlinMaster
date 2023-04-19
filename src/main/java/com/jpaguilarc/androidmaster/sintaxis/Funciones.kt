package com.jpaguilarc.androidmaster

val age:Int = 24
val dadAge = 61
val momAge = 57
val myName = "Juan99"

fun main(){
    variablesNumericas(age)
    variablesAlfanumericas(age.toString())

    var familyAge:Int = sumParentAges(dadAge, momAge)
    println("The total sum of years that have my family is $familyAge")

    var printMyName:String = showMyName(myName)
    println(printMyName)

    defaultValue("suffledefault")

    println(ternaryMult(momAge, dadAge))
}

fun variablesNumericas(age:Int) {
    /**
     *  Variables Numéricas
     */
    //Float
    val decimalNum:Float = 321.7f

    var exampleSumIntFloat: Float = decimalNum + age
    println(exampleSumIntFloat)
}

fun variablesAlfanumericas(formatAge:String) {
    var templateString:String = "this is a test: my age is ${formatAge.toString()}"
    println(templateString)
}

fun sumParentAges(dad:Int, mom:Int): Int {
    return dad + mom
}

fun showMyName(myName:String): String {
    return myName
}

fun defaultValue(testString:String = "defaultvalue") {
    println("$testString")
}

// Ternary function
fun ternaryMult(first:Int, second:Int): Int = first * second