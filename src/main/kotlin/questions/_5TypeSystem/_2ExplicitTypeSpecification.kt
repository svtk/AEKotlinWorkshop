package questions._5TypeSystem

import javacode.typesystem.JavaClass

fun explicitType() {
    // IllegalStateException: JavaClass().value must not be null
    val value: String = JavaClass().value
    println(value.length)
}

fun main() {
    explicitType()
}