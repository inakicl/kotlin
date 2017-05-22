import java.util.*

/**
 * Created by 7fbd12 on 22/05/2017.
 */


fun main(args: Array<String>) {
    val r = Random()
    print("Vamos a ver 3 numeros divididos en mayor, mediano, pequeño o iguales: \n \n")
    val a = r.nextInt(5)
    val b = r.nextInt(5)
    val c = r.nextInt(5)

    //Son iguales
    if (a == b)
        print("Hay numeros iguales $a \n")
    if (a == c)
        print("Hay numeros iguales $c \n")
    if (c == b)
        print("Hay numeros iguales $c \n")
    //mayor
    if (a > b && a > c)
        print("El mayor es   $a \n")
    if (b > a && b > c)
        print("El mayor es   $b \n")
    if (c > a && c > b)
        print("El mayor es   $c \n")
    //mediano
    if ((a < b && a > c) || (a < c && a > b))
        print("El mediano es $a \n")
    if ((b < a && b > c) || (b < c && b > a))
        print("El mediano es $b \n")
    if ((c < b && c > a) || (c < a && c > b))
        print("El mediano es $c \n")
    //pequeño
    if (a < b && a < c)
        print("El pequeño es $a \n")
    if (b < a && b < c)
        print("El pequeño es $b \n")
    if (c < a && c < b)
        print("El pequeño es $c \n")

}