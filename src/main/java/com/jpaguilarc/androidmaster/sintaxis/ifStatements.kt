package com.jpaguilarc.androidmaster

fun main() {
    ifMultiple()
}

fun ifMultiple(){
    var age:Int = 18
    var parentPermission:Boolean = false
    if(age >= 18 && parentPermission){
        println("Puedo beber cerveza!!")
    } else {
        println("No puedo beber cerveza :(")
    }
}

fun ifInt(){
    var age:Int = 29

    if (age is Int) {
        println("La variable es de tipo entero!!")
    }
}

fun ifBoolean(){
    var buttonPressed:Boolean = true

    if(!buttonPressed) {
        println("Desactivando sistema de alarmas.")
    }
}

fun ifAnidado(){
    val animal = true
    val typeAnimal = "ant"

    if (animal){
        if(typeAnimal=="dog"){
            println("Es un perro!")
        } else if(typeAnimal=="cat") {
            println("Es un gato!")
        } else if(typeAnimal=="bird") {
            println("Es un pajaro!")
        } else {
            println("Es un animal pero no es un animal esperado!")
        }
    } else {
        println("No es un animal")
    }
}

fun elseIf(){
    val animal = "jiraffee"

    if(animal=="dog"){
        println("Es un perro!")
    } else if(animal=="cat"){
        println("Es un gato!")
    } else if(animal=="pajaro"){
        println("Es un pajaro!")
    } else {
        println("No es ninguno de los animales esperados.")
    }
}

fun ifBasic(){
    val name = "Juan97"

    if(name=="Juan99"){
        println("Hola $name !!")
    } else {
        println("Hola $name, no tienes permiso para estar acá.")
    }
}