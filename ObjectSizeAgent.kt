// ObjectSizeAgent.kt
import java.lang.instrument.Instrumentation

object ObjectSizeAgent {
    private var instrumentation: Instrumentation? = null

    // The premain method is called before the main method of the application
    @JvmStatic
    fun premain(agentArgs: String?, inst: Instrumentation) {
        instrumentation = inst
    }

    // Function to get the size of an object
    fun getObjectSize(obj: Any): Long {
        return instrumentation?.getObjectSize(obj) ?: 0
    }
}
