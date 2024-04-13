/**
 * Descripción:Adivina Numero.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import kotlin.random.Random

fun main() {
        // Genera un número aleatorio entre 1 y 30 
    val aleatorio = Random.nextInt(1, 31)
        // Inicializa el contador de intentos en 5
    var intentos = 5

    println("Adivina el número (entre 1 y 30):")
// Bucle principal del juego que se ejecuta mientras haya intentos restantes
    while (intentos > 0) {
        // Solicita al usuario que ingrese un número y lo convierte a Int
        val adivina = readLine()?.toIntOrNull()
 // Verifica si la entrada del usuario no es un número válido
        if (adivina == null) {
            println("Entrada inválida. Inténtalo de nuevo.")
            continue
        }
// Compara el número adivinado con el número aleatorio
        if (adivina == aleatorio) {
            println("¡Felicidades! ¡Has adivinado el número!")
            return
        } else if (adivina < aleatorio) {
            println("El número a adivinar es mayor.")
        } else {
            println("El número a adivinar es menor.")
        }
// Decrementa el contador de intentos restantes
        intentos--
        println("Intentos restantes: $intentos")
    }
// Se ejecuta cuando el usuario ha agotado todos los intentos
    println("Game over. No has logrado adivinar el número.")
}
