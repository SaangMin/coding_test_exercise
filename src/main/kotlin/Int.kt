class Solution4 {
    fun solution(l: Int, r: Int): IntArray {
        val answer = mutableListOf<Int>()
        val regex = Regex("^[50]+$")
        for(i in l..r) {
            if(regex.matches(i.toString())){
                answer.add(i)
            }
        }
        return if(answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}

fun main() {
    println(Solution4().solution(5, 555).toList())
    println(Solution4().solution(10, 20).toList())
    println(Solution4().solution(1, 1000000).toList())
}
