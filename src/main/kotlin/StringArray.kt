class Solution3 {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val cards1Copy = cards1.toMutableList()
        val cards2Copy = cards2.toMutableList()
        goal.forEach {
            when (it) {
                cards1Copy.firstOrNull() -> {
                    cards1Copy.removeFirst()
                }

                cards2Copy.firstOrNull() -> {
                    cards2Copy.removeFirst()
                }

                else -> {
                    return "No"
                }
            }
        }
        return "Yes"
    }
}

fun main() {
    println(
        Solution3().solution(
            arrayOf("i", "drink", "water"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ).toList()
    )
    println(
        Solution3().solution(
            arrayOf("i", "water", "drink"),
            arrayOf("want", "to"),
            arrayOf("i", "want", "to", "drink", "water")
        ).toList()
    )
}
