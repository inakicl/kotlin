import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


/**
 * Created by 7fbd12 on 25/05/2017.
 */
fun main(args: Array<String>) {
    //pedir al usuario filas y colum
    val br = BufferedReader(InputStreamReader(System.`in`))
    var fil: Long = -1
    var colm: Long = -1
    do {
        try {
            println("Escribe un numero de filas:")
            fil = br.readLine().toLong()
            println("Escribe un número de columnas:")
            colm = br.readLine().toLong()
        } catch (e: NumberFormatException) {
            println("Eso no era un número ")
        }
    } while (fil == -1L || colm == -1L)

    //funcionamiento de la matriz con numeros aleatorios
    val dim = arrayOf(fil, colm)
    val array = Array(dim[0].toInt(), { IntArray(dim[1].toInt()) })
    val rand = Random()
    // fill
    var a = arrayOf<Int>()//El array normal donde se guardan todos los valores de la matriz mientras se crea
    var se = setOf<Int>()//El array o conjunto donde no hay repetidos
    array.forEachIndexed { i, it ->
        it.indices.forEach { j ->
            it[j] = rand.nextInt(9)
            a += it[j]
            se += it[j]
        }
    }
    // print
    println("TU MATRIZ:")
    array.forEach {
        println(it.asList())
    }

    println()
    println("El array con todos los números:")
    println(a.asList())//Mostrar el array
    println("El conjunto sin los números repetidos si es que hay:")
    println(se)

}


