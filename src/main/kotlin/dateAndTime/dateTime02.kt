package dateAndTime

import kotlinx.datetime.*


fun main() {
    val instant1 = Instant.parse("2000-01-01T20:00:00Z")
    val instant2 = Instant.parse("2000-10-14T00:00:00Z")

    val period1: DateTimePeriod = instant1.periodUntil(instant2, TimeZone.UTC)

    println(period1)
    // P9M12DT4H

    println("Months: ${period1.months} Days: ${period1.days} Hours: ${period1.hours}")
    // Months: 9 Days: 12 Hours: 4

    val instant3 = Instant.parse("2000-01-01T00:00:00Z")
    println(instant3)
    // 2000-01-01T00:00:00Z

    val period3: DateTimePeriod = DateTimePeriod(years = 1, months = 1, days = 1, hours = 1, minutes = 1, seconds = 1, nanoseconds = 123456789L)
    println(period3)
    // P1Y1M1DT1H1M1.123456789S

    val after = instant3.plus(period3, TimeZone.UTC)

    println(after)
    // 2001-02-02T01:01:01.123456789Z

    val before = instant3.minus(period3, TimeZone.UTC)

    println(before)
    // 1998-11-29T22:58:58.876543211Z
}
