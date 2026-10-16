package elena.fierros.directorio.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import elena.fierros.directorio.modelos.UsuarioRepositorio

class UsuarioViewModelFactory (
    private val repositorio: UsuarioRepositorio
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) : T {
        if (modelClass.isAssignableFrom((UsuarioViewModel::class.java))){
            return UsuarioViewModel(repositorio) as T
        }
        throw IllegalArgumentException("ViewModel desconocido")
    }
}