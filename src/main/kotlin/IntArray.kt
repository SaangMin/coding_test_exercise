class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr.toList()
        query.indices.forEach { i ->
            if (i % 2 == 0) {
                answer = answer.filterIndexed { index, _ -> index <= query[i] }
            } else {
                answer = answer.filterIndexed { index, _ -> index >= query[i] }
            }
        }
        return answer.toIntArray()
    }
}

fun main() {
    println(
        Solution().solution(
            intArrayOf(0, 1, 2, 3, 4, 5),
            intArrayOf(4, 1, 2),
        ).toList()
    )
}
