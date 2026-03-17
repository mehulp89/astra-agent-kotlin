pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "astra-agent-kotlin"
include(":core")
include(":providers")
include(":planner")
include(":workflow")
include(":rag")
include(":local-llm")
include(":multimodal")
include(":android-compose")
include(":studio-plugin")
