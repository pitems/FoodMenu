package com.example.foodrecipes.Testing

fun main(args:Array<String>){

    val myNumbers = listOf(2,3,6,23,90)

    val myPredicate = {num:Int -> num>10} //Lambda Function
    val check1 = myNumbers.all { it>10 } //Are all elements greater than 10?
    println(check1)

    val check2=myNumbers.any {it>10} //Does any of these element satisfy the Predicate?
    println(check2)

    val totalCount = myNumbers.count(myPredicate)// Number of elements that satisfy the Predicate
    println(totalCount)

    val findNumber = myNumbers.find(myPredicate)// Returns the first number that matches the Predicate
    println(findNumber)
}