import kotlin.io.*

fun main() {
    user_task_num = readln().toInt()

    if (user_task_num < 1 || user_task_num > 7)
        throw Exception("Task number should be a number between 1 and 7")

    when (user_task_num) {
        TASK_NUM_1 -> Task1()
        TASK_NUM_2 -> Task2()
        TASK_NUM_3 -> Task3()
        TASK_NUM_4 -> Task4()
        TASK_NUM_5 -> Task5()
        TASK_NUM_6 -> Task6()
        TASK_NUM_7 -> Task7()
    }
}
private var user_task_num = 0

private val TASK_NUM_1: Int = 1
private val TASK_NUM_2: Int = 2
private val TASK_NUM_3: Int = 3
private val TASK_NUM_4: Int = 4
private val TASK_NUM_5: Int = 5
private val TASK_NUM_6: Int = 6
private val TASK_NUM_7: Int = 7
