package questions._5TypeSystem

fun mightThrowNPE() {
    println(JavaClass().value.length)
}

fun main() {
    mightThrowNPE() // throws NPE, because getValue() returns null
}