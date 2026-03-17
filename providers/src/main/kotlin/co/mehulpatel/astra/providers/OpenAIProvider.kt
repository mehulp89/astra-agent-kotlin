
package co.mehulpatel.astra.providers

class OpenAIProvider(
    private val apiKey: String
): LLMProvider {

    override suspend fun generate(prompt: String): String {
        return "Mock AI response for: $prompt"
    }
}
