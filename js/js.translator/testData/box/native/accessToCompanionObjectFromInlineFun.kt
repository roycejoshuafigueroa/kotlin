// EXPECTED_REACHABLE_NODES: 1375
// FILE: main.kt

package foo

external class B {
    companion object {
        val value: String
    }
}

inline fun test() = B.value

fun box(): String {
    return test()
}

// FILE: native.js

function B() {};

B.value = "OK";
