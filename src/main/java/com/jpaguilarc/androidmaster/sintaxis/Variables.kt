package com.jpaguilarc.androidmaster


fun main(){

    /**
     *  Variables Numéricas
     */

    //Int -2,147,483,647 a 2,147,483,647
    val age:Int = 24 //Constante
    var age2:Int = 24 //Variable

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val cash:Long = 3_217_321

    //Float
    val decimalNum:Float = 321.7f

    //Double
    val doubleNum:Double = 372.1

    var exampleSumIntFloat: Float = decimalNum + age

    /**
     *  Variables Alfanuméricas
     */

    //Char
    val oneChar:Char = 'J'

    //String
    val stringWord:String = "Juan99"
    val stringWord2:String = "55"

    var stringConcatenada:String = "Hola"

    /**
     * Format Strings
     */

    var stringConcatenada2:String = "Prueba de format string $stringWord, tengo $age"
    println(stringConcatenada2)

    val intToString:String = age.toString()

    /**
     *  Variables Booleanas
     */

    //Boolean
    val trueOrNot = true
    val falseOrYes = false

}