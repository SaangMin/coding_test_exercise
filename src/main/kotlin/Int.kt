class Solution4 {
    private var ansList: MutableList<IntArray>? = null
    fun solution(n: Int): Array<IntArray> {
        ansList = mutableListOf()
        dfs(n, 1, 3, 2)
        val answer = ansList!!.toTypedArray()
        for (i in ansList!!.indices) {
            answer[i] = ansList!![i]
        }
        return answer
    }

    private fun dfs(n: Int, start: Int, to: Int, mid: Int) {
        if (n == 1) {
            ansList?.add(intArrayOf(start, to))
            return
        }
        dfs(n - 1, start, mid, to)
        ansList?.add(intArrayOf(start, to))
        dfs(n - 1, mid, to, start)
    }
}

fun main() {
    println(Solution4().solution(2).toList())
    println(Solution4().solution(3).toList())
}
