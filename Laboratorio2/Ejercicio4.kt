/**
 * Descripción:Figuras
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */

 //Clase abstracta que representa una figura geométrica.

abstract class Shape {
    abstract val area: Double
    abstract val perimetro: Double


     //Calcula el área de la figura.

    abstract fun calculateArea()

     //Calcula el perímetro de la figura.

    abstract fun calculatePerimetro()


     //Imprime el área de la figura.

    fun printArea() {
        println("El área es: $area")
    }

     //Imprime el perímetro de la figura.
    fun printPerimetro() {
        println("El perímetro es: $perimetro")
    }
}


 //Clase que representa un cuadrado.

class Square(private val lado: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calculateArea() {
        area = lado * lado
    }

    override fun calculatePerimetro() {
        perimetro = 4 * lado
    }
}

 //Clase que representa un círculo.

class Circle(private val radio: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calculateArea() {
        area = Math.PI * radio * radio
    }

    override fun calculatePerimetro() {
        perimetro = 2 * Math.PI * radio
    }
}


 //Clase que representa un rectángulo.

class Rectangle(private val length: Double, private val width: Double) : Shape() {
    override var area: Double = 0.0
    override var perimetro: Double = 0.0

    override fun calculateArea() {
        area = length * width
    }

    override fun calculatePerimetro() {
        perimetro = 2 * (length + width)
    }
}

fun main() {
    val square = Square(5.0)
    square.calculateArea()
    square.calculatePerimetro()
    square.printArea()
    square.printPerimetro()

    val circle = Circle(3.0)
    circle.calculateArea()
    circle.calculatePerimetro()
    circle.printArea()
    circle.printPerimetro()

    val rectangle = Rectangle(4.0, 6.0)
    rectangle.calculateArea()
    rectangle.calculatePerimetro()
    rectangle.printArea()
    rectangle.printPerimetro()
}