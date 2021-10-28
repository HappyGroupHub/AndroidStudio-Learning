package com.gmail.chiyc88.lib

fun main() {
    println("PLease enter two numbers")
    val a = readLine()?.toInt()
    val b = readLine()?.toInt()
    if (b != null) {
        if (a != null) {
            println(calculate(a, b))
        }
    }
}

fun calculate(a: Int, b: Int): Int {
    return a + b
}


class HelloWorld