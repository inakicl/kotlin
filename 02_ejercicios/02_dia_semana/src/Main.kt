import javax.swing.JOptionPane

/**
 * Created by 7fbd12 on 22/05/2017.
 */
fun main(args: Array<String>) {
    var n = 0
    var numero = 0
    do {
        val s = JOptionPane.showInputDialog(null, "Introduce un número del 1..7 \npara descubrir su número de día asociado.")
        if (s == null) {
            numero = 0
        } else {
            numero = Integer.parseInt(s)
        }
        val diaSemana: String
        n = numero

        when (numero) {
            1 -> diaSemana = "Lunes."
            2 -> diaSemana = "Martes."
            3 -> diaSemana = "Miércoles."
            4 -> diaSemana = "Jueves."
            5 -> diaSemana = "Viernes."
            6 -> diaSemana = "Sábado."
            7 -> diaSemana = "Domingo."
            else -> diaSemana = "Ese día no existe..."
        }
        JOptionPane.showMessageDialog(null, "$diaSemana")
    } while (n < 1 || n > 7)
}