// variables.kt
import ObjectSizeAgent.kt
import ObjectSizeAgent.jar
fun main() {
    // Example object
    val myString = "Hello, Instrumentation!"

    // Get the size of the string using the ObjectSizeAgent
    val sizeString = ObjectSizeAgent.getObjectSize(myString)
    println("Size of the string:" $size "bytes")
}
