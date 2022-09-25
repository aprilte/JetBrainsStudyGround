import java.lang.Exception

fun main(args: Array<String>) {
    // write your code here
    limitchecker( readln().toInt(), readln())
}

fun limitchecker(spd: Int, lims: String?) {
    var lim = 60
    try {
        lim = lims?.toInt() ?: 60
    }catch (ex: Exception) {

    }

    print(
        when {
            lim < spd -> "Exceeds the limit by ${spd - lim} kilometers per hour"
            spd <= lim -> "Within the limit"
            else -> ""
        }
    )
}