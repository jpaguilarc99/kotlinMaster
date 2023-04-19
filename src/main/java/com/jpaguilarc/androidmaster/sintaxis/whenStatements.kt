package com.jpaguilarc.androidmaster

fun main(){
    result(true)
}

fun getSemester(month:Int) {
    when(month) {
       in 1..6 -> print("Primer semestre")
       in 7..12 -> print("Segundo semestre")
       !in 1..12 -> print("Semestre invalido")
    }
}

fun getTrimester(month:Int) {
    when(month){
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> print("Trimeste invalido")
    }
}

fun getMonth(month:Int){
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }
}

fun result(value:Any) {
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("ternary test")
    }
}