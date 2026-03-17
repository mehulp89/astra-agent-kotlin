
package co.mehulpatel.astra.core

class Tool(
    val name: String,
    val description: String,
    val execute: suspend (Map<String, String>) -> String
)
