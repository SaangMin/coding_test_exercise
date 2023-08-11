class Solution2 {
    fun solution(code: String): String {
        var answer = ""
        var mode = true
        var i = 0
        while (i != code.length) {
            if (mode) {
                if (code[i] != '1') {
                    if (i % 2 == 0) {
                        answer += code[i]
                    }
                } else {
                    mode = false
                }
                i++
            } else {
                if (code[i] != '1') {
                    if (i % 2 == 1) {
                        answer += code[i]
                    }
                } else {
                    mode = true
                }
                i++
            }
        }
        return answer.ifEmpty { "EMPTY" }
    }
}

fun main() {
    println(Solution2().solution("abc1abc1abc"))
}
