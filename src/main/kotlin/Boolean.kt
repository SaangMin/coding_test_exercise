class Solution5 {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        return (x1 || x2) && (x3 || x4)
    }
}

fun main() {
    println(Solution5().solution(false, true,true, true))
    println(Solution5().solution(true, false, false,false))
}
