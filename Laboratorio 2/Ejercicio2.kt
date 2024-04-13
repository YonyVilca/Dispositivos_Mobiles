/**
 * Descripción:Producto.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */

 //Clase Producto representa un producto con su precio y descuento.
class Producto {
    private var precio: Double = 0.0
    private var descuento: Double = 0.0

//Establece el precio del producto.

    fun setPrecio(precio: Double) {
        if (precio >= 0) {
            this.precio = precio
        } else {
            throw IllegalArgumentException("El precio no puede ser negativo")
        }
    }

//Obtiene el precio del producto.

    fun getPrecio(): Double {
        return precio
    }

//Establece el descuento del producto.

    fun setDescuento(descuento: Double) {
        if (descuento >= 0 && descuento <= 100) {
            this.descuento = descuento
        } else {
            throw IllegalArgumentException("El descuento debe estar entre 0 y 100")
        }
    }

//Obtiene el descuento del producto.

    fun getDescuento(): Double {
        return descuento
    }

//Calcula el precio final del producto aplicando el descuento.

    fun calcularPrecioFinal(): Double {
        val precioFinal = precio - (precio * (descuento / 100))
        return precioFinal
    }
}