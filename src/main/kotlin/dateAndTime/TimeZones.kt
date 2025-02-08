package dateAndTime


/*
UTC-05:00
UTC+00:00
UTC+02:00
UTC+05:45

Time is formatted as Thh:mm:ss.fff, Thh:mm:ss (extended), Thhmmss or Thhmmss.fff (basic),
where h denotes the hour digits, m the minutes digits, s the seconds, and f the seconds' decimal digits (depending on the accuracy).
T is used as an indicator that the string that follows represents time.
Also, note that midnight may only be referred as 00:00:00 and not 24:00:00. For example:


 T12:00:15
T120015
T14:01:34.55
14:01:34.55
T170517.3432
T00:00:00
00:00:00


 The time zone indicator is formatted as Z (for UTC standard time),
 ±hh:mm, ±hhmm, or ±hh. For example:

  1Z
+07:00
+0700
-02:00
-02


 All time data have a fixed number of digits, and if the actual numbers have less digits,
 then they have to be padded with leading zeros.
 For example, the correct date format is 2022-02-02 and not 2022-2-2.

Date and time together are represented in the format of <date>T<time><time zone indicator>.

 The time indicator T cannot be omitted here, while the time zone indicator is optional.

Following are some examples of the ISO 8601 date-time representation:

 2022-02-16T16:31:03+02:00
2022-02-16T16:31:03Z
20220216T163103Z


 The ISO 8601 duration representation
Time duration is represented as P<n>Y<n>DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDM<n>DT<n>H<n>M<n>S, where P denotes that this string represents time duration,
Y denotes years, M months, D days, T is the days-time divider, H denotes hours,
the M after T denotes minutes, and S – seconds. <n> denotes the value of the time element that follows it. For example:

P2Y11M5DT4H10M3S

P4Y      Duration of 4 years
PT3H5M   Duration of 3 hours and 5 minutes
P7DT6H   Duration of 7 days and 6 hours

 The last item may also have decimal digits. For example:

P12.5Y         Duration of 12.5 years
PT2H3M10.23S   Duration of 2 hours, 3 minutes and 10.23 seconds
P2M7.3D        Duration of 2 months and 7.3 days

The ISO 8601 time interval representation
Time intervals can be expressed in the following formats:

1) <Starting date-time>/<Ending date-time>

2022-12-01T00:00:00Z/2022-12-31T23:59:59Z
2000-01-01T00:00:00+03:00/2011-01-01T00:00:00+03:00
2022-02-01T14:00:00-05:00/2022-02-01T14:15:59-05:00

<Starting date-time>/<Duration>

For example:

2000-01-01T00:00:00Z/P3Y10M4DT2H11M13S
2012-07-19T17:12:00Z/PT35M

<Duration>/<Ending date-time>

For example:

P1Y1M2DT21H9M7S/2000-01-01T00:00:00Z
P3Y/2021-01-01T01:00:00Z

*/