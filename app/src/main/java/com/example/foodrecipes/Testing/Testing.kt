package com.example.foodrecipes.Testing

fun main(args:Array<String>){
    val myNumbers = listOf(2,3,4,6,23,90)

    val mySmallNums = myNumbers.filter { v -> v<10}
    val mySmallNumsIt = myNumbers.filter { it <10}
    for(nums in mySmallNumsIt){
      //  println(nums)
    }

    //Map
    val mySquaredNumbers = myNumbers.map { num -> num * num }
    val mySquaredNumbersIt = myNumbers.map { it * it }

    for (nums in mySquaredNumbersIt){
        //println(nums)
    }

    val mySmallSquaredNums = myNumbers.filter{it < 10}.map {it*it}
    for(nums in mySmallSquaredNums){
        println(nums)
    }

    var people = listOf<Person>(
        Person(10, "Phill"),
        Person(23, "Jane"),
        Person(17, "Sam")
    )


    var namesSimple = people.map {it.name }
    var namesFilter = people.filter { person -> person.name.startsWith("P") }.map {it.name }
    for(names in namesFilter){
        println(names)
    }
}

class Person(var age:Int,var name:String){
    //TODO()
}