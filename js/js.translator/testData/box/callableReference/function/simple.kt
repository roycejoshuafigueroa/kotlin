// EXPECTED_REACHABLE_NODES: 1375
// This test was adapted from compiler/testData/codegen/box/callableReference/function/local/.
package foo

fun box(): String {
    fun foo() = "OK"
    return (::foo)()
}
