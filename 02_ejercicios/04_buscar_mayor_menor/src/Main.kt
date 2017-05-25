import java.util.*

/**
 * Created by 7fbd12 on 25/05/2017.
 */

fun main(args: Array<String>) {
    val arr = IntArray(10, { i -> 0 })
    var rand = Random()
    var i = 0
    while (i < 10) {
        arr[i] = rand.nextInt(100)
        i++
    }
    println("Visualizar array "); visualizar(arr)
    println("El numero mayor del array ${buscarMayor(arr)}")
    println("El número menor del array ${buscarMenor(arr)}")
    var n = rand.nextInt(100)
    var ex = existeN(n, arr)
    if (ex) {
        println("El número $n existe en el array")
    } else {
        println("El número $n no existe en el array")
    }
}

fun visualizar(arr: IntArray) {
    var i = 0
    while (i < arr.size) {
        if (i == arr.size - 1) {
            print("${arr[i]}")
        } else {
            print("${arr[i]} , ")
        }
        i++
    }
    println()
}

fun buscarMayor(arr: IntArray): Int {
    var mayor = -1
    var i = 0
    while (i < arr.size) {
        if (arr[i] > mayor) {
            mayor = arr[i]
        }
        i++
    }
    return mayor
}

fun buscarMenor(arr: IntArray): Int {

    var menor = 101
    var i = 0
    while (i < arr.size) {
        if (arr[i] < menor) {
            menor = arr[i]
        }
        i++
    }
    return menor
}

fun existeN(n: Int, arr: IntArray): Boolean {

    var i = 0
    while (i < arr.size) {
        if (arr[i] == n)
            return true
        i++
    }

    return false
}