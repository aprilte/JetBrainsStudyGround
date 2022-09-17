fun main() {
    // write your code here
    val army = readln().toInt()
    println(
        when {
            army < 1 -> "no army"
            army in 1..4 -> "few"
            army in 5..9 -> "several"
            army in 10..19 -> "pack"
            army in 20..49 -> "lots"
            army in 50..99 -> "horde"
            army in 100..249 -> "throng"
            army in 250..499 -> "swarm"
            army in 500..999 -> "zounds"
            1000 <= army -> "legion"
            else -> "undefined"
         }
    )
}