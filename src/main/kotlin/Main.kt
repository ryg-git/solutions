class Solution {
    private fun findComp(cnt: Int): Long {
        var ans = 1L
        for (i in cnt downTo (cnt - 1)) {
            ans *= i
        }
        return ans / 2
    }

    fun interchangeableRectangles(rectangles: Array<IntArray>): Long {
        val ratios = rectangles.map { it.first().toDouble() / it.last() }
        val groups = ratios.groupBy { it }

        return groups.keys.fold(0L) { a, e -> a + findComp(groups[e]!!.size) }
    }
}

fun main(args: Array<String>) {
    val s = Solution()
    println(
        s.interchangeableRectangles(
            arrayOf(
                intArrayOf(4, 8),
                intArrayOf(3, 6),
                intArrayOf(10, 20),
                intArrayOf(15, 30)
            )
        )
    )
}