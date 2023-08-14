class Solution4 {
    fun solution(n: Int): Array<IntArray> {
        val answer: Array<IntArray> = Array(n) { _ -> IntArray(n) }
        val lastInt = n * n
        var minInt = 0
        var maxInt = n - 1
        var int = 1
        var x = 0
        var y = 0
        while (int <= lastInt) {
            if (x == minInt && y < maxInt) {
                answer[x][y] = int
                y++
                int++
            } else if (y == maxInt && x <= maxInt) {
                answer[x][y] = int
                x++
                int++
            } else if (x == maxInt + 1 && y !=minInt) {
                answer[x][y] = int
                y--
                int++
            } else if(x <= maxInt + 1 && y == minInt) {
                answer[x][y] = int
                x--
                int++
            }
            if(x == maxInt && y == maxInt) {
                maxInt --
            }
            if(x == minInt + 1 && y == minInt) {
                minInt ++
            }
        }
        return answer
    }
}

fun main() {
    println(Solution4().solution(4).toList())
    println(Solution4().solution(5).toList())
}
