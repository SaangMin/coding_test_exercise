class Solution4 {
    fun solution(k: Int, score: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val scoreList = mutableListOf<Int>()
        score.forEach {
            scoreList.add(it)
            if (scoreList.size > k) {
                scoreList.remove(scoreList.minOf { it })
            }
            answer.add(scoreList.minOf { it })
        }
        return answer.toIntArray()
    }
}

fun main() {
    println(
        Solution4().solution(
            3,
            intArrayOf(10, 100, 20, 150, 1, 100, 200)
        ).toList()
    )
    println(
        Solution4().solution(
            4,
            intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)
        ).toList()
    )
}
