fun next()  = readLine()!!.trim()


fun main() {

    val x = mutableListOf<IntArray>()
    val par = IntArray((5*10e5 + 2).toInt()) {it}
    val ans = mutableListOf<Int>()

    val q = next().toInt()
    for (i in 1..q) {
        val inst = next().split(' ').map { it.toInt() }.toIntArray()

        x.add(inst)
    }

    for (i in x.reversed()) {
        if (i.first() == 1) {
            ans.add(par[i.last()])
        } else {
            par[i[1]] = par[i.last()]
        }
    }

    println(ans.reversed().joinToString(" "))
}