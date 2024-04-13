/**
 * Descripción:Gestión de biblioteca.
 * Fecha: 25/03/2024
 * Modificación: 26/03/2024
 *
 */

// Clase abstracta base Material
abstract class Material(val titulo: String, val autor: String, val anioPublicacion: Int) {
    abstract fun mostrarDetalles()
}
// Subclase de Material para libros
 class Libro(titulo: String, autor: String, anioPublicacion: Int, val genero: String, val numeroPaginas: Int) : Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $anioPublicacion")
        println("Género: $genero")
        println("Número de páginas: $numeroPaginas")
    }
}
// Subclase de Material para revistas
class Revista(titulo: String, autor: String, anioPublicacion: Int, val issn: String, val volumen: Int, val numero: Int, val editorial: String) : Material(titulo, autor, anioPublicacion) {
    override fun mostrarDetalles() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: $anioPublicacion")
        println("ISSN: $issn")
        println("Volumen: $volumen")
        println("Número: $numero")
        println("Editorial: $editorial")
    }
}
// Clase Usuario para representar a los usuarios de la biblioteca
class Usuario(val nombre: String, val apellido: String, val edad: Int) {
    fun reservarMaterial(material: Material) {
        // Lógica para reservar material
    }
    
    fun devolverMaterial(material: Material) {
        // Lógica para devolver material
    }
}
// Clase Biblioteca para representar la biblioteca
class Biblioteca {
    val materialesDisponibles = mutableListOf<Material>()
    val usuariosRegistrados = mutableListOf<Usuario>()
    
    fun prestarMaterial(material: Material, usuario: Usuario) {
        // Lógica para prestar material
    }
    
    fun devolverMaterial(material: Material, usuario: Usuario) {
        // Lógica para devolver material
    }
}

// Crear instancias de las subclases y ejecutar las operaciones
val libro = Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1925, "Novela", 180)
val revista = Revista("National Geographic", "Varios autores", 2021, "1234-5678", 10, 3, "National Geographic Society")

libro.mostrarDetalles()
revista.mostrarDetalles()