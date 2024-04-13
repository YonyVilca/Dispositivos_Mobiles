/**
 * Descripción:Cuenta bancaria.
 * Autor: Yony Alex Vilca Mamani.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */
//Clase que representa una cuenta bancaria.

class CuentaBancaria {
    private var saldo: Double = 0.0
    private var limiteRetiro: Double = 0.0

    fun setSaldo(nuevoSaldo: Double) {
        saldo = nuevoSaldo
    }
//Obtiene el saldo actual de la cuenta bancaria.

    fun getSaldo(): Double {
        return saldo
    }

    //Establece el límite de retiro de la cuenta bancaria.

    fun setLimiteRetiro(nuevoLimite: Double) {
        limiteRetiro = nuevoLimite
    }


     //Realiza un retiro de la cuenta bancaria.

    fun realizarRetiro(monto: Double): Boolean {
        if (monto <= saldo && monto <= limiteRetiro) {
            saldo -= monto
            return true
        }
        return false
    }
}