package com.jpaguilarc.androidmaster

fun main(){
    //Instanciando arrays
    var weekDays = arrayOf("Lunes",
                            "Martes",
                            "Miercoles",
                            "Jueves",
                            "Viernes",
                            "Sábado",
                            "Domingo"
                            )
    //Acceso a elementos
    weekDays[0] = "Monday"

    //Bucles para Arrays
    //for(position in weekDays.indices){
    //    println("He pasado por aquí ${weekDays[position]}")
    //}

    for((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    for(weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}