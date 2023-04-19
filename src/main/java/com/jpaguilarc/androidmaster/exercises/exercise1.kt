package com.jpaguilarc.androidmaster.exercises

fun main(){
    val morningNotification:Int = 51
    val eveningNotification:Int = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    if (numberOfMessages<100) println("You have $numberOfMessages notifications.") else println("Your phone is blowing up! You have 99+ notifications")
}