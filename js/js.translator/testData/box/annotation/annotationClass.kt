// EXPECTED_REACHABLE_NODES: 1374
package foo

annotation class bar

public annotation class Baz(val a: String)

fun box(): String {
    return "OK"
}
