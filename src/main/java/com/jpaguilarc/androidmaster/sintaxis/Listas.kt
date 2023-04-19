package com.jpaguilarc.androidmaster

fun main(){
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf(
        "lunes",
        "martes",
        "miercoles",
        "jueves",
        "viernes"
    )
    weekDays.add(0, "jpaguiDay")
    println(weekDays)
}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes","martes","miercoles","jueves","viernes")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val filterList = readOnly.filter { it.contains("a") }
    println(filterList)

    readOnly.forEach { weekDay -> println(weekDay) }
}