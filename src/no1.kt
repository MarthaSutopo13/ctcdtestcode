fun main() {
    println(Factorial(7))
}

fun Factorial(number: Int) : String {
    var total = 1
    var process = ""

    for (i in number downTo 1) {
        total *= i
        if (i == 1) {
            process += i
        }else {
            process = process + i + "*"
        }
    }

    return number.toString() + "! (" + process + ") = " +total.toString()
}