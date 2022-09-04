import java.util.NoSuchElementException
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val arr = arrayListOf<Int>()

    for (i in 0..10) {
        try {
            arr.add(scanner.nextInt())
        } catch (e: NoSuchElementException) {
            break
        }
    }

    arr.forEach {
        println(it)
    }
}
