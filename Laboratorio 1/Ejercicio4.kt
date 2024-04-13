/**
 * Descripción:Calculadora Elemental.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import java.util.Scanner

fun main() {
    // Inicialización del Scanner para leer la entrada del usuario
    val scanner = Scanner(System.`in`)
    var option: Int
// Bucle que muestra el menú hasta que el usuario elija salir
    do {
        // Mostrar el menú
        println("==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Ingrese una opción: ")
        option = scanner.nextInt()
// Realizar la operación correspondiente según la opción seleccionada
        when (option) {
            1 -> Suma()
            2 -> Resta()
            3 -> Multiplicacion()
            4 -> Divicion()
            5 -> println("Saliendo...")
            else -> println("Opción inválida. Por favor, seleccione una opción válida.")
        }
    } while (option != 5) // Continuar mostrando el menú hasta que el usuario elija salir
}

/**
 * Función que realiza la suma de dos números ingresados por el usuario.
 */
fun Suma() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 + num2
    println("El resultado de la suma es: $result")
}
/**
 * Función que realiza la resta de dos números ingresados por el usuario.
 */
fun Resta() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 - num2
    println("El resultado de la resta es: $result")
}
/**
 * Función que realiza la multiplicación de dos números ingresados por el usuario.
 */
fun Multiplicacion() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el primer número: ")
    val num1 = scanner.nextDouble()
    print("Ingrese el segundo número: ")
    val num2 = scanner.nextDouble()
    val result = num1 * num2
    println("El resultado de la multiplicación es: $result")
}
/**
 * Función que realiza la división de dos números ingresados por el usuario.
 * Verifica si el divisor no es cero antes de realizar la división.
 */
fun Divicion() {
    val scanner = Scanner(System.`in`)
    print("Ingrese el dividendo: ")
    val dividend = scanner.nextDouble()
    print("Ingrese el divisor: ")
    val divisor = scanner.nextDouble()
// Verificar si el divisor no es cero antes de realizar la división
    if (divisor != 0.0) {
        val result = dividend / divisor
        println("El resultado de la división es: $result")
    } else {
        println("No se puede dividir entre cero.")
    }
}