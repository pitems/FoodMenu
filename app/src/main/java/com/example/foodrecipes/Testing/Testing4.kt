package com.example.foodrecipes.Testing

fun main (args:Array<String>){
    val country = Country()

    country.name="Dumbfuckistan"
    println(country.name)
    country.setup()
}

class Country{
    lateinit var name: String

    fun setup(){
        name ="USA"
        println("The name of the country is $name")
    }
}

// lateinit used only with mutable data type [ var ]
// lateinit used only with non-nullable data type
// lateinit values must be initialised before you use it