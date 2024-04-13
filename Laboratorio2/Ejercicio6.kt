/**
 * Descripción:Sistema de alquiler de vehiculos.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */
// Interfaz que define el comportamiento de un vehículo alquilable.
interface VehiculoAlquilable {
    fun alquilar()
    fun devolver()
}
// Clase que representa un coche.
class Coche : VehiculoAlquilable {
    override fun alquilar() {
        println("Coche alquilado")
    }

    override fun devolver() {
        println("Coche devuelto")
    }
}
// Clase que representa una moto.
class Moto : VehiculoAlquilable {
    override fun alquilar() {
        println("Moto alquilada")
    }

    override fun devolver() {
        println("Moto devuelta")
    }
}
// Función principal que prueba el sistema de alquiler de vehículos.
fun main() {
    val coche = Coche()
    coche.alquilar()
    coche.devolver()

    val moto = Moto()
    moto.alquilar()
    moto.devolver()
}