package elena.fierros.directorio.vistas

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import elena.fierros.directorio.modelos.Usuario

@Composable
fun PerfilScreen(usuario: Usuario){
    Column(
        modifier = Modifier.padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = usuario.nombre,
            style = MaterialTheme.typography.headlineMedium
        )
        Text (text = usuario.correo)
        Text(text = "Carrera: ${usuario.carrera}")
    }
}