package com.example.tp1

//Ecrire une fonction qui affiche les x premiers nombres pairs ou impairs

fun displayOddOrEvenNumbers(x: Int, isOdd: Boolean = true) {
    var i = 0
    var count = 0
    while (count < x) {
        if (i % 2 == if (isOdd) 1 else 0) {
            println(i)
            count++
        }
        i++
    }
}


//Ecrire une fonction qui affiche les x premiers nombres de la suite Fibonacci

fun displayFibonacciNumbers(x: Int) {
    var n1 = 0
    var n2 = 1
    var n3: Int
    var count = 0
    while (count < x) {
        println(n1)
        n3 = n1 + n2
        n1 = n2
        n2 = n3
        count++
    }
}

//Ecrire une fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.

fun factorial(x: Int = 10): Int {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

//Ecrire une fonction qui affiche les x premiers nombres premiers

fun displayPrimeNumbers(x: Int) {
    var count = 0
    var i = 2
    while (count < x) {
        var isPrime = true
        for (j in 2 until i) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println(i)
            count++
        }
        i++
    }
}


fun main() {
    displayOddOrEvenNumbers(10, false)
    displayFibonacciNumbers(10)
    println(factorial())
    displayPrimeNumbers(10)
}





