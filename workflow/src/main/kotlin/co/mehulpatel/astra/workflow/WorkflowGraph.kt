
package co.mehulpatel.astra.workflow

data class Node(
    val id: String,
    val action: () -> Unit
)

class WorkflowGraph {

    private val nodes = mutableListOf<Node>()

    fun add(node: Node) {
        nodes.add(node)
    }

    fun run() {
        nodes.forEach { it.action() }
    }
}
