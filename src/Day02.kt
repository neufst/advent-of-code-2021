fun main() {

    fun part1(input: List<String>): Int {
        val position = object {
            var horizontal: Int = 0
            var depth: Int = 0
        }

        fun setNewCourse(command: String, steps: Int) {
            when (command) {
                "forward" -> {
                    position.horizontal += steps
                }
                "down" -> {
                    position.depth += steps
                }
                "up" -> {
                    position.depth -= steps
                }
            }
        }

        input.forEach {
            val commandWithValue = it.split(" ")
            setNewCourse(commandWithValue[0], commandWithValue[1].toInt())
        }
        return position.horizontal * position.depth
    }

    fun part2(input: List<String>): Int {
        val position = object {
            var horizontal: Int = 0
            var depth: Int = 0
            var aim: Int = 0
        }
        fun setNewCourse(command: String, steps: Int) {
            when (command) {
                "forward" -> {
                    position.horizontal += steps
                    position.depth += (steps * position.aim)
                }
                "down" -> {
                    position.aim += steps
                }
                "up" -> {
                    position.aim -= steps
                }
            }
        }
        input.forEach {
            val commandWithValue = it.split(" ")
            setNewCourse(commandWithValue[0], commandWithValue[1].toInt())
        }
        return position.horizontal * position.depth
    }




    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))

}