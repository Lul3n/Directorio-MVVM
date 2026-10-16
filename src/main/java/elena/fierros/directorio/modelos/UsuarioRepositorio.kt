package elena.fierros.directorio.modelos

class UsuarioRepositorio {
    private val usuarios = listOf(
        Usuario(1, "Elena Fierros Valenzuela", "elena.fierros@correo.com", "Computación"),
        Usuario(2, "No se habla de Bruno","bruno.diaz@correo.com","Mecatrónica"),
        Usuario(3, "Carla Ruiz","carla.ruiz@correo.com","Diseño"),
        Usuario(4, "Diego Torres","diego.torres@correo.com","Industrial"),
        Usuario(5, "Elena Garza","elena.garza@correo.com","Biotecnología"),
    )
    fun getUsuarios(): List<Usuario>{
        return usuarios
    }
    fun getMiUsuario(): Usuario {
        return usuarios.first()
    }
}