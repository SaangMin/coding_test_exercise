class Solution {
    private var answer = 0
    fun solution(numbers: IntArray, target: Int): Int {
        dfs(0,0,numbers, target)
        return answer
    }

    private fun dfs(sum: Int, idx: Int, numbers: IntArray, target: Int) {
        if (idx == numbers.size && sum == target) {
            answer++
            return
        }
        if (idx >= numbers.size) {
            return
        }

        dfs(sum + numbers[idx], idx+1, numbers, target)
        dfs(sum - numbers[idx], idx+1, numbers, target)
    }
}

fun main() {
    println(
        Solution().solution(
            intArrayOf(1, 1, 1, 1, 1),
            3,
        )
    )
    println(
        Solution().solution(
            intArrayOf(4, 1, 2, 1),
            4,
        )
    )
}
