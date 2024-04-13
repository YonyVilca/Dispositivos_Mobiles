/**
 * Descripción:Evaluacion Empleados.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 22/03/2024
 * Modificación: 22/03/2024
 *
 */
import kotlin.math.round
fun evalempleado(puntuacion: Int, salario: Double): String {
   // Evaluación del nivel de rendimiento basado en la puntuación
    val nivel = when (puntuacion) {
      in 0..3 -> "Desempeño inaceptable"
      in 4..6 -> "Desempeño aceptable"
      in 7..10 -> "Desempeño meritorio"
      else -> "Puntuación inválida"
    }
    // Cálculo del dinero recibido basado en la puntuación y el salario
    val dinero = round(salario * (puntuacion / 10.0))
    return "Nivel de Rendimiento: $nivel\nDinero recibido: $%.2f".format(dinero)
  }
  fun main() { 

    val puntuacion = 8
    val salario = 10000.0
  // Evaluación del empleado y obtención del resultado
    val resultado = evalempleado(puntuacion, salario)
  
    println(resultado)
  }