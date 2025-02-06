package dateAndTime

import kotlinx.datetime.*

fun main() {

    val dateTime: Instant = Instant.parse("2022-02-17T19:00:00Z")

    val tz: TimeZone = TimeZone.of("UTC+2")

    val local: LocalDateTime = dateTime.toLocalDateTime(tz)

    println(local)  // prints 2022-02-17T21:00

    // The parameters are: Year, month, day, hour, minutes
    val dateTime1: LocalDateTime = LocalDateTime(2022, 2, 1, 17, 0)
    println(dateTime1)  // 2022-02-01T17:00

    // The parameters are: Year, month, day, hour, minutes, seconds
    val dateTime2: LocalDateTime = LocalDateTime(2022, 2, 1, 17, 0, 16)
    println(dateTime2)  // 2022-02-01T17:00:16

    // The parameters are: Year, month, day, hour, minutes, seconds, nanoseconds
    val dateTime3: LocalDateTime = LocalDateTime(2022, 2, 1, 17, 0, 16, 3456)
    println(dateTime3)  // 2022-02-01T17:00:16.000003456

    println("0050-01-01".toLocalDate())

    println(Clock.System.todayAt(TimeZone.of("UTC-5")))

   // println("2022-12-31T10:10:00".toLocalDate())

   // println("50-01-01".toLocalDate())

    println( ((42) % -10) )

}