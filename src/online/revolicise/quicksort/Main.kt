package online.revolicise.quicksort

import kotlin.math.abs
import kotlin.math.max

/**
 *@author uncle_yumo
 *@fileName Main
 *@proName algorithm-learning
 *@school Wuxi_University
 *@stuNumber 22344131
 *@createTime 2024/10/8
 *@updateTime 2024/10/8
 *@description
 **/

class Main {

    // companion object is used to define static members of a class
    companion object {
        fun quickSort(arr: IntArray) {
            if (arr.size <= 1) return
            var temp: Int = arr[0]
            for (i in 1 until arr.size) {

            }
        }

        fun divideDemo(arr: IntArray): String {
            println("sorted arr : ${if (arr.size <= 2) return "failure" else "efficient" }")
            println("sorted arr : ${arr.contentToString()}")
            val arr1 = arr.copyOfRange(0, arr.size / 2)
            val arr2 = arr.copyOfRange(arr.size / 2, arr.size)

            // 确保 arr1 和 arr2 的长度大于 0
            // if (arr1.isEmpty() || arr2.isEmpty()) return "|"

            val a1 = arr1.size
            val a2 = arr2.size

            // Get the max item of arr1
            val s1 = arr1.maxOrNull() ?: 0 // 使用 maxOrNull，防止空数组引发异常
            val s2 = arr2.maxOrNull() ?: 0 // 同样处理 arr2

            return "${abs(a1 - a2)}|${abs(s1 - s2)}"
        }
    }
}

fun main() {
//    var arr = intArrayOf(10,7,4,6,9,3,8,1,2,5)
    var arr = intArrayOf(0)
    val result = Main.divideDemo(arr)

    if (result == "failure") println("Size of array is 1 or less")
    else println("|a1-a2| : ${result.split("|")[0]}, |s1-s2| : ${result.split("|")[1]}")
}