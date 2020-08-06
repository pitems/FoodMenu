package com.example.foodrecipes.Testing

//val pi:Float = 3.14f //Waste of memory if not used because the system will allocate space
                    //for it at the startup, this is where lazy comes to help
val pi:Float by lazy{3.14f}

fun main (args:Array<String>){

    println("Some initial Code")

    val area1= pi *4*4 //Variable will be initialized

    val area2 = pi *9*9 //Variable is not initialized again because it is in memory

    println("Some more code")
}