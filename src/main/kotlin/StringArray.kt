class Solution3 {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer = mutableListOf<String>()
        for(s in picture) {
            var kStr = ""
            for(c in s) {
                repeat(k) {
                    kStr += c
                }
            }
            repeat(k) {
                answer.add(kStr)
            }
        }
        return answer.toTypedArray()
    }
}

fun main() {
    println(
        Solution3().solution(
            arrayOf(".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."),
            2
        ).toList()
    )
    println(
        Solution3().solution(
            arrayOf("x.x", ".x.", "x.x"),
            3
        ).toList()
    )
    println(
        Solution3().solution(
            arrayOf("x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x.", "x.x.x.x.x.x.x.x.x.x."),
            10
        ).toList()
    )
}
