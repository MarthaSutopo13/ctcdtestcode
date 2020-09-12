fun main() {
    ValueLevel("123456")
}

fun ValueLevel(number: String) : String {
    for (i in number.length downTo 1) {
        for (a in i..number.length) {
            print(" ")
        }

        for (b in i downTo 1) {
            if(b != i) {
                print(0)
            } else {
                print(number[number.length - b])
            }
        }

        println("")
    }
    return ""
}