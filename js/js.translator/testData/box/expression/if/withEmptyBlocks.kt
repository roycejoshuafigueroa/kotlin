// EXPECTED_REACHABLE_NODES: 1374
package foo

fun box(): String {
    var r = ""
    if (r != "") else r += "O"
    if (r == "O") r += "K" else;
    return r
}
