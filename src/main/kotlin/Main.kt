fun main() {

    calculator()

}

    fun calculator() {
    println("Enter the first Number.")
    val z1String = readln()
    val z1 = z1String.toDouble()
    println("Enter the second Number.")
    val z2String = readln()
    val z2 = z2String.toDouble()

//had to got with .toDouble, because z1-,z2String has not accepting int or long

    println("Enter an operator (+,-,*,/).")
    val op = readln()
    val result: Double

    when (op) {

        "+" -> result = z1 + z2
        "-" -> result = z1 - z2
        "*" -> result = z1 * z2
        "/" -> result = z1 / z2

        else -> {
            println("Error! operator is not correct")
            return
        }
    }

    println("$z1 $op $z2 = $result")

    // was much easier than with java scanner
}


/*

import java.util.*

fun main() {

    calculator()
}

fun calculator() {
    val scanner = Scanner(System.`in`)

    println("Enter two Numbers.")
    val z1 = scanner.nextDouble()
    val z2 = scanner.nextDouble()

    println("Enter an operator (+,-,*,/).")
    val op = scanner.next()
    val result: Double

    when (op) {

        "+" -> result = z1 + z2
        "-" -> result = z1 - z2
        "*" -> result = z1 * z2
        "/" -> result = z1 / z2

        else -> {
            println("Error! operator is not correct")
            return
        }
    }

    println("$z1 $op $z2 = $result")

}

 */
