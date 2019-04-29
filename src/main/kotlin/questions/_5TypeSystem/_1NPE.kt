package questions._5TypeSystem

import javacode.typesystem.JavaClass

fun mightThrowNPE() {
    println(JavaClass().value.length)
}

fun main() {
    mightThrowNPE() // throws NPE, because getValue() returns null
}