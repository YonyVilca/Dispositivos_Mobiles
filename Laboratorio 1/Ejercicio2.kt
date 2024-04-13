/**
 * Descripción:Piedra, papel o tijera.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */

import kotlin.random.Random

fun main() {
    // Lista de opciones disponibles para el juego
    val opciones = listOf("piedra", "papel", "tijera")
    // Elección aleatoria de la computadora entre las opciones disponibles
    val computadora = opciones[Random.nextInt(opciones.size)]
// Solicitar al usuario que elija una opción
    println("Elige una opción: piedra, papel o tijera")
    val usuario = readLine()
// Determinar el resultado del juego
    if (usuario in opciones) {
        println("La computadora eligió: $computadora")
        if (usuario == computadora) {
            println("Empate")
        } else if (
            (usuario == "piedra" && computadora == "tijera") ||
            (usuario == "papel" && computadora == "piedra") ||
            (usuario == "tijera" && computadora == "papel")
        ) {
            println("Ganaste")
        } else {
            println("Perdiste")
        }
    } else {
        println("Opción inválida")
    }
}