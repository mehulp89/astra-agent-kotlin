
package co.mehulpatel.astra.providers

interface LLMProvider {
    suspend fun generate(prompt: String): String
}
