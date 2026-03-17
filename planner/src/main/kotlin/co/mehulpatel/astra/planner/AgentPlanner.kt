
package co.mehulpatel.astra.planner

class AgentPlanner {

    fun plan(goal: String): List<String> {
        return listOf(
            "Analyze goal: $goal",
            "Break into steps",
            "Execute tools",
            "Return result"
        )
    }
}
