package elena.fierros.directorio.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import elena.fierros.directorio.modelos.Usuario
import elena.fierros.directorio.modelos.UsuarioRepositorio

class UsuarioViewModel (
    private val repositorio: UsuarioRepositorio
) : ViewModel(){
    private val _usuarios= mutableStateOf<List<Usuario>>(emptyList())
    val  usuarios: State<List<Usuario>> = _usuarios

    val miUsuario: Usuario = repositorio.getMiUsuario()

    init {
        cargarUsuarios()
    }

    private fun cargarUsuarios () {
        _usuarios.value = repositorio.getUsuarios()
    }

}