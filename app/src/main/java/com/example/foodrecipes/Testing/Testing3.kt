package com.example.foodrecipes.Testing

fun main(args:Array<String>){
    //Find out lenght of name
    val name:String?= null

    //1. Safe Call ( ?. )
    // Returns the lenght if 'name' is not null else returns NULL, use it if you
    //don't mind getting NULL value
    println("The length of name is ${name?.length}")

    //2. Safe Call with let ( ?.let )
    //It executes the block ONLY IF name is NOT NULL
    name?.let {
        println("The length of name is ${name.length}")
    }

    //3. Elvis-operator ( ?: )
    //When we have a nullable reference 'name', we can say "is name not null"
    // , use it, otherwise use some non-null value

    //Old Way
    val len = if(name !=null)
        name.length
    else -1

    //Elvis Way
    val lenght = name?.length ?: -1

    println("The lenght of name is ${lenght}")


    //4. Non-Null assertion
    //Use it when you are sure the value is NOT NULL
    //Throws a NullPointerException if the value is found to be null
    println("The lenght of name is ${name!!.length}")

}