// EXPECTED_REACHABLE_NODES: 1377
package foo

class A() {
    val p = { "OK" }
}


fun box(): String {
    return A().p()
}