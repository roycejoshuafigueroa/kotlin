// EXPECTED_REACHABLE_NODES: 1378
package foo

fun box(): String {
    var boo = "OK"
    var foo = object {
        val bar = object {
            val baz = boo
        }
    }

    return foo.bar.baz
}

