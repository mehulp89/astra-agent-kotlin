
package co.mehulpatel.astra.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun AstraChat(onSend:(String)->Unit){

    var message by remember { mutableStateOf("") }

    Column {

        TextField(
            value = message,
            onValueChange = { message = it }
        )

        Button(onClick = {
            onSend(message)
            message = ""
        }) {
            Text("Send")
        }
    }
}
