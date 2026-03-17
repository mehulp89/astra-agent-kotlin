
package co.mehulpatel.astra.rag

class VectorStore {

    private val data = mutableListOf<String>()

    fun add(text: String) {
        data.add(text)
    }

    fun search(query: String): List<String> {
        return data.filter { it.contains(query, true) }
    }
}
