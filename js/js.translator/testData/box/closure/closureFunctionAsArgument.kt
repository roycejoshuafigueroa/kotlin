// EXPECTED_REACHABLE_NODES: 1379
package foo

fun test(f: () -> String): String {
    val funLit = { f() }
    return funLit()
}


fun box(): String {
    return test { "OK" }
}