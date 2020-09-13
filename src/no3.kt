import java.text.SimpleDateFormat
import java.util.*


fun main() {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd hh:mm")
    val date1: Date = simpleDateFormat.parse("2020-09-09 10:12")
    val date2: Date = simpleDateFormat.parse("2020-09-19 10:10")
    Duration(date1, date2)
}

fun Duration(dt1: Date, dt2: Date){
    var diff: Long = dt2.getTime() - dt1.getTime()
    val secondsInMilli: Long = 1000
    val minutesInMilli = secondsInMilli * 60
    val hoursInMilli = minutesInMilli * 60
    val daysInMilli = hoursInMilli * 24
    val weeksInMilli = daysInMilli * 7
    val monthsInMilli = weeksInMilli * 4
    val yearsInMilli = monthsInMilli * 12

    val elapsedYear: Long = diff / yearsInMilli
    diff = diff % yearsInMilli

    val elapsedMonth: Long = diff / monthsInMilli
    diff = diff % monthsInMilli

    val elapsedWeek: Long = diff / weeksInMilli
    diff = diff % weeksInMilli

    val elapsedDays: Long = diff / daysInMilli
    diff = diff % daysInMilli

    val elapsedHours: Long = diff / hoursInMilli
    diff = diff % hoursInMilli

    val elapsedMinutes: Long = diff / minutesInMilli
    diff = diff % minutesInMilli

    val elapsedSeconds: Long = diff / secondsInMilli

    print(elapsedYear.toString()+"y"+elapsedMonth.toString()+"m"+elapsedWeek.toString()+"w"+elapsedDays.toString()+"d"+elapsedHours.toString()+"h"+elapsedMinutes.toString()+"m"+elapsedSeconds.toString()+"s")
}