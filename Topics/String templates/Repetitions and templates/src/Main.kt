fun main() {
    // write your code here
    val input: String = readLine() ?: ""
    print("${input.length} repetitions of the word ${input}: ")
    repeat(input.length) {
        print(input)
    }
}
