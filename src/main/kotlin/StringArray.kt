class Solution3 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val answer = mutableListOf<Int>()
        val yearningMap = mutableMapOf<String, Int>()
        for(i in name.indices) {
            yearningMap[name[i]] = yearning[i]
        }
        for(p in photo) {
            var score = 0
            for(photoName in p) {
                if(yearningMap.keys.contains(photoName)) {
                    score += yearningMap[photoName]!!
                }
            }
            answer.add(score)
        }
        return answer.toIntArray()
    }
}

fun main() {
    println(
        Solution3().solution(
            arrayOf("may", "kein", "kain", "radi"),
            intArrayOf(5, 10, 1, 3),
            arrayOf(
                arrayOf("may", "kein", "kain", "radi"),
                arrayOf("may", "kein", "brin", "deny"),
                arrayOf("kon", "kain", "may", "coni")
            )
        ).toList()
    )
    println(
        Solution3().solution(
            arrayOf("kali", "mari", "don"),
            intArrayOf(11, 1, 55),
            arrayOf(
                arrayOf("kali", "mari", "don"),
                arrayOf("pony", "tom", "teddy"),
                arrayOf("con", "mona", "don")
            )
        ).toList()
    )
    println(
        Solution3().solution(
            arrayOf("may", "kein", "kain", "radi"),
            intArrayOf(5, 10, 1, 3),
            arrayOf(
                arrayOf("may"),
                arrayOf("kein", "deny", "may"),
                arrayOf("kon", "coni")
            )
        ).toList()
    )
}
