import kotlin.math.abs

class Solution4 {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val result = listOf(a, b, c, d).groupBy { it }
        return when (result.size) {
            1 -> 1111 * a
            2 -> {
                val sortedList = result.values.sortedBy { it.count() }
                if (sortedList.first().size == 1) {
                    val q = sortedList.first()[0]
                    val p = sortedList.last()[0]
                    (10 * p + q) * (10 * p + q)
                } else {
                    val q = sortedList.first()[0]
                    val p = sortedList.last()[0]
                    (p + q) * abs(p - q)
                }
            }

            3 -> {
                val filteredList = result.values.filter { it.size == 1 }
                filteredList[0][0] * filteredList[1][0]
            }

            else -> result.values.minByOrNull { it.first() }!![0]
        }
    }
}

fun main() {
    println(Solution4().solution(2, 2, 2, 2))
    println(Solution4().solution(4, 1, 4, 4))
    println(Solution4().solution(6, 3, 3, 6))
    println(Solution4().solution(2, 5, 2, 6))
    println(Solution4().solution(6, 4, 2, 5))
}
