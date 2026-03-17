# AstraAgent 🚀

**Kotlin-Native AI Agent Framework for Android & JVM**

> Build AI-powered apps with Agents, Workflows, RAG, and Multimodal support — fully in Kotlin.

---

## ✨ Why AstraAgent?

Most AI frameworks are Python-first.
**AstraAgent brings modern AI capabilities to Kotlin & Android developers.**

✅ Agent-based architecture
✅ Workflow graph execution
✅ Tool calling
✅ Local + Cloud LLM support
✅ RAG (Vector Search)
✅ Multimodal (Image + Audio)
✅ Jetpack Compose AI UI

---

## 🧠 Features

| Feature               | Status |
| --------------------- | ------ |
| AI Agents             | ✅      |
| Workflow Graphs       | ✅      |
| Agent Planner         | ✅      |
| OpenAI Integration    | ✅      |
| Local LLM (Ollama)    | ⚡      |
| Vector Database (RAG) | ⚡      |
| Multimodal AI         | ⚡      |
| Android Compose UI    | ✅      |

---

## 🏗 Architecture

```
User Input
   ↓
Agent
   ↓
Planner → Workflow Graph
   ↓
LLM Provider (OpenAI / Local)
   ↓
Tools / RAG / Multimodal
   ↓
Response
```

---

## ⚡ Quick Start

### 1. Add Dependency

```gradle
implementation("co.mehulpatel:astra-agent:0.1.0")
```

---

### 2. Basic Usage

```kotlin
val agent = AstraAgent(
    provider = OpenAIProvider("YOUR_API_KEY")
)

val response = agent.run("Explain Jetpack Compose")

println(response)
```

---

## 📱 Android Example

```kotlin
setContent {
    AstraChat { message ->
        coroutineScope.launch {
            val response = agent.run(message)
            println(response)
        }
    }
}
```

---

## 🔌 OpenAI Integration

```kotlin
val provider = OpenAIProvider(apiKey = "YOUR_KEY")
```

Supports:

* GPT models
* Streaming (coming soon)

---

## 🧩 Workflow Graph Example

```kotlin
val graph = WorkflowGraph()

graph.add(Node("step1") {
    println("Step 1")
})

graph.add(Node("step2") {
    println("Step 2")
})

graph.run()
```

---

## 🧠 Agent Planner

```kotlin
val planner = AgentPlanner()

val steps = planner.plan("Build AI app")

steps.forEach { println(it) }
```

---

## 🔍 RAG (Vector Search)

```kotlin
val store = VectorStore()

store.add("Kotlin is modern")
store.search("Kotlin")
```

---

## 🎯 Roadmap

* Streaming LLM responses
* Gemini / Claude support
* On-device AI (llama.cpp)
* Vector DB integration (Qdrant)
* AI Studio Plugin UI
* Agent Debugger

---

## 🏆 Vision

> Become the **LangChain for Kotlin & Android**

---

## 🤝 Contributing

PRs are welcome. Let’s build the Kotlin AI ecosystem together.

---

## 📄 License

MIT License © Mehul Patel
https://mehulpatel.co
