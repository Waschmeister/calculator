import java.io.InputStream

fun main() {


    calculator()

}
class Inputs (val z1: Double, val z2: Double, val op: String)
fun readInputs(): Inputs {

    println("Enter the equation.")
    val (z1String, op, z2String) = readln().split(' ')
   // val z1String = readln()
    val z1 = z1String.toDouble()
  //  val z2String = readln()
    val z2 = z2String.toDouble()


//had to got with .toDouble, because z1-,z2String has not accepting int or long

   // val op = readln()
    return Inputs(z1, z2, op)

}

fun calculator() {
    val inputs: Inputs = readInputs()
    val result: Any


    when (inputs.op) {

        "+" -> result = inputs.z1 + inputs.z2
        "-" -> result = inputs.z1 - inputs.z2
        "*" -> result = inputs.z1 * inputs.z2
        "/" -> result = inputs.z1 / inputs.z2
        "<" -> result = inputs.z1 < inputs.z2
        ">" -> result = inputs.z1 > inputs.z2

        else -> {
            println("Error! operator is not correct")
            return
        }
    }
    val endresult = result.toString()

        println("${inputs.z1} ${inputs.op} ${inputs.z2} = $endresult")


    // was much easier than  java scanner
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
    val result: Any

    when (op) {

        "+" -> result = z1 + z2
        "-" -> result = z1 - z2
        "*" -> result = z1 * z2
        "/" -> result = z1 / z2
        "<" -> result = z1 < z2
        ">" -> result = z1 > z2

        else -> {
            println("Error! operator is not correct")
            return
        }
    }

    println("$z1 $op $z2 = $result")

}

*/


