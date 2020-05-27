//fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//    val isUnit = println("This is an expression")
//    println(isUnit)
//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
//}

import java.util.*    // required import

//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//}
//
//fun main(args: Array<String>) {
//    feedTheFish()
//}

//fun main() {
//    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//    // eager, creates a new list
//    val eager = decorations.filter { it [0] == 'p' }
//    println("eager: " + eager)
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: " + filtered)
//    // force evaluation of the lazy list
//    val newList = filtered.toList()
//    println("new list: " + newList)
//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${ lazyMap2.toList() }")}



