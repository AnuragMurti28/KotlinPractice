import java.lang.instrument.Instrumentation

object Agent {
    private lateinit var instrumentation: Instrumentation

    // Called before the main method when the agent is specified
    @JvmStatic
    fun premain(agentArgs: String?, inst: Instrumentation) {
        instrumentation = inst
    }

    fun getObjectSize(obj: Any): Long {
        return instrumentation.getObjectSize(obj)
    }
}
