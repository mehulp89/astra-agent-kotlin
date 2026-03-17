
package co.mehulpatel.astra.core

import co.mehulpatel.astra.providers.LLMProvider

class AstraAgent(
    private val provider: LLMProvider
) {

    suspend fun run(prompt: String): String {
        return provider.generate(prompt)
    }
}
