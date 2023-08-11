class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        val rankMap = mutableMapOf<Int, Boolean>()
        for (i in rank.indices) {
            rankMap[rank[i]] = attendance[i]
        }
        val rankList = rankMap.filterValues { it }.keys.sorted()
        return rank.indexOf(rankList[0]) * 10000 + rank.indexOf(rankList[1]) * 100 + rank.indexOf(rankList[2]) * 1
    }
}

fun main() {
    println(
        Solution().solution(
            intArrayOf(3, 7, 2, 5, 4, 6, 1),
            booleanArrayOf(false, true, true, true, true, false, false)
        )
    )
    println(
        Solution().solution(
            intArrayOf(1, 2, 3),
            booleanArrayOf(true, true, true)
        )
    )
    println(
        Solution().solution(
            intArrayOf(6, 1, 5, 2, 3, 4),
            booleanArrayOf(true, false, true, false, false, true)
        )
    )
}
