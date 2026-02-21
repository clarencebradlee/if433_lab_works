package oop_00000137487_clarencebradlee.week01

fun main() {
   val score = 85

   val grade = when {
      score >= 85 -> "a"
      score >= 70 -> "b"
      score >= 60 -> "c"
      else -> "d"
   }
   println("nilai: $score, grade: $grade")
}