package elena.fierros.directorio.vistas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import elena.fierros.directorio.viewmodels.UsuarioViewModel
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import kotlinx.coroutines.selects.select

@Composable
fun PrincipalScreen(
    viewModel: UsuarioViewModel,
    modifier: Modifier = Modifier
){
    var pestana by rememberSaveable { mutableIntStateOf(0) }

    Column(modifier = Modifier) {
        PrimaryTabRow(selectedTabIndex = pestana) {
            Tab(
                selected = pestana == 0,
                onClick = {pestana = 0},
                text = { Text("Todos") }
            )
            Tab(
                selected = pestana == 1,
                onClick = {pestana = 1},
                text = {Text("Mi perfil")}
            )
        }
        if (pestana == 0) {
            UsuariosScreen(usuarios = viewModel.usuarios.value)
        } else {
            PerfilScreen(usuario = viewModel.miUsuario)
        }
    }
}