fun main() {
    fun part1(input: List<String>): Int {
        val inputAsInt = input.map { it.toInt() }
        val windowed = inputAsInt.windowed(2)
        return windowed.count { (a,b) -> a < b }
    }

    fun part2(input: List<String>): Int {
        val inputAsInt = input.map { it.toInt() }
        val windowed = inputAsInt.windowed(3).windowed(2)
        return windowed.count { (a,b) -> a.sum() < b.sum() }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
