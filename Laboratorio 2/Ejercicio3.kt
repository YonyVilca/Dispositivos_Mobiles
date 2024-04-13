/**
 * Descripción:Gestion de empleados
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */
// Clase abstracta base Empleado
abstract class Empleado(
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val salario: Double
) {
    abstract fun calcularPago(): Double
}

// Subclase de Empleado para empleados a tiempo completo
class EmpleadoTiempoCompleto(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    val horasTrabajadas: Int,
    val tarifaHora: Double
) : Empleado(nombre, apellido, edad, salario) {
    override fun calcularPago(): Double {
        return horasTrabajadas * tarifaHora
    }
}

// Subclase de Empleado para empleados a medio tiempo
class EmpleadoMedioTiempo(
    nombre: String,
    apellido: String,
    edad: Int,
    salario: Double,
    val horasTrabajadas: Int,
    val tarifaHora: Double,
    val diasTrabajados: Int
) : Empleado(nombre, apellido, edad, salario) {
    override fun calcularPago(): Double {
        return horasTrabajadas * tarifaHora * diasTrabajados
    }
}

fun main() {
    // Crear instancias de las subclases
    val empleadoTiempoCompleto = EmpleadoTiempoCompleto("Juan", "Pérez", 30, 0.0, 40, 10.0)
    val empleadoMedioTiempo = EmpleadoMedioTiempo("María", "González", 25, 0.0, 20, 8.0, 5)

    // Ejecutar operaciones y realizar pruebas
    println("Pago de empleado a tiempo completo: ${empleadoTiempoCompleto.calcularPago()}")
    println("Pago de empleado a medio tiempo: ${empleadoMedioTiempo.calcularPago()}")
}