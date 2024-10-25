enum class DayPart{
    MORNING, AFTERNOON, EVENING
}

//task 01

data class Event(
    val title : String,
    val description : String? = null,
    val dayPart: DayPart,
    val duration: Int
)

fun main() {
    val event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", DayPart.EVENING, 15)
}

//task 02