package dateAndTime

import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.periodUntil
import kotlin.time.Duration


fun main() {

    val tz1 = TimeZone.currentSystemDefault()

    val tz2 = TimeZone.of("UTC+02:00")

   // val tz3 = TimeZone.of("Europe/UTC")

    val tz4 = TimeZone.of("Asia/Seoul")

    println(((3+4) * (5/2)))

    //val tz5 = TimeZone.of("London")
    println("$tz1 $tz2 $tz4 ")

    val instant1 = Instant.parse("2100-01-01T00:00:00Z")
    val instant2 = Instant.parse("2105-07-09T15:23:40Z")

    val duration: Duration = instant2 - instant1
    println(duration)                                             // 2015d 15h 23m 40s
    println(duration.inWholeDays)                                 // 2015
    println(duration.inWholeHours)                                // 48375

    println( instant1.periodUntil(instant2, TimeZone.UTC) )       // P5Y6M8DT15H23M40S
    println( instant1.periodUntil(instant2, TimeZone.UTC).days )  // 8

    var a = 10
    when(a) {
        11, 12 -> print("Ok")

        a + a -> print("Ok")

        in 1..22 -> print("Ok")
    }
}
