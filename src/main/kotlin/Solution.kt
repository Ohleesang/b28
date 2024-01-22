/**
 * 등차 or 등비 수열
 */

class Solution {
    fun isSequence(intArr: IntArray): String {
        val d1 = intArr[0] - intArr[1]
        val d2 = intArr[1] - intArr[2]
        if (d1 == d2) return "등차"
        else return "등비"
    }

    fun solution(common: IntArray): Int {
        var answer: Int = 0
        val sequenceStr = isSequence(common.sliceArray((0..2)))
        var cm = 0

        when (sequenceStr) {
            "등차" -> {
                cm = common[1] - common[0]
                answer = common.last() + cm
            }

            "등비" -> {
                cm = common[1] / common[0]
                answer = common.last() * cm
            }
        }
        return answer
    }
}

fun main() {
    Solution().solution(intArrayOf(1, 2, 3, 4))//5
    Solution().solution(intArrayOf(2, 4, 8))//5
}