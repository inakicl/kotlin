import javax.swing.JOptionPane

/**
 * Created by 7fbd12 on 22/05/2017.
 */

fun esPrimo(n: Int) {
    var i = 2
    if (n == 1) {
        println("Por convenio no es ");
    }
    while (i < n && n % i != 0) {
        if (i % 2 == 0) {
        } else {
            print("$i, ")
        }
        i += 1
    }
    println(n)
    if (i < n) {
        println("Número No primo");
    } else {
        println("Número Primo");
    }

}

fun main(args: Array<String>) {
    var s = JOptionPane.showInputDialog(null, " Introduce un número entero.")
    if (s == null) {
        s = "1"
    }
    var n = s.toInt()
    esPrimo(n)

}