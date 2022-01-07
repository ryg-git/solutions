fun next() = readLine()!!.trim()

fun solve() {
    val nMax = 1 shl 20
    val n = next().toInt()
    val p = next().split(" ").map { it.toInt() }

    for (i in 1..n) {
        val (a, b, c, d) = listOf(nMax, nMax, nMax, nMax)

    }

}

fun main() {
    val q = next().toInt()

    for (i in 1..q) {
        solve()
    }
}
