import javax.swing.JOptionPane

/**
 * Created by 7fbd12 on 22/05/2017.
 */

fun main(args: Array<String>) {


    //Dividir "n" hasta encontrar un valor
    var s = JOptionPane.showInputDialog(null, " Introduce un número entero.")
    if (s == null) {
        s = "1"
    }
    var i = 2

    var n = s.toInt()

    if (n == 1) {
        println("Por convenio no es ");
    }

    while (i < n && n % i != 0) {
        if (i % 2 == 0) {
        } else {
            println(i)
        }
        i += 1;
    }
    println(n)

    if (i < n) {
        println("Número No primo");
    } else {
        println("Número Primo");
    }


}