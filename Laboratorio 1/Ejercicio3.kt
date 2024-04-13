/**
 * Descripción:Estadistica alumnos.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import java.util.Scanner

fun main() {
    // Inicialización de Scanner para leer la entrada del usuario
    val scanner = Scanner(System.`in`)
    // Solicitar al usuario que ingrese la cantidad de alumnos en el salón
    print("Ingrese la cantidad de alumnos en el salón: ")
    val cantidadAlumnos = scanner.nextInt()
    // Inicialización de variables para almacenar las edades máxima y mínima, y todas las edades ingresadas
    var edadMaxima = Int.MIN_VALUE
    var edadMinima = Int.MAX_VALUE
    var todasLasEdades = ""
    // Bucle para recopilar las edades de cada alumno y calcular la edad máxima y mínima
for (i in 1..cantidadAlumnos) {
    for (i in 1..cantidadAlumnos) {
        print("Ingrese la edad del alumno $i: ")
        val edad = scanner.nextInt()
// Actualizar la edad máxima si se encuentra una nueva edad máxima
        if (edad > edadMaxima) {
            edadMaxima = edad
        }
// Actualizar la edad mínima si se encuentra una nueva edad mínima
        if (edad < edadMinima) {
            edadMinima = edad
        }
// Agregar la edad actual a la cadena de todas las edades
        todasLasEdades += "$edad, "
    }

    todasLasEdades = todasLasEdades.dropLast(2)
// Imprimir el resultado de las edades recopiladas
    println("=== Edades ===")
    println("Máximo = $edadMaxima")
    println("Mínimo = $edadMinima")
    println("Todos = $todasLasEdades")
}