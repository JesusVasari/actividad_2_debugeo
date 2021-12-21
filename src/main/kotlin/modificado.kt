fun main() {


    var mensaj :String = readLine()!!
    var edad = readLine()!!.toInt()
    printMens(mensaj)
    printVela(edad)
    printCapSuperior(edad)
    printCapInferior(edad)

    printMens(mensaj)

}

fun printMens(mensaj:String):String {
   return(mensaj)
}

fun printVela(edad: Int) {

    repeat(edad) {
        print(",")
    }
    println()


    repeat(edad) {
        print("|")
    }
    println()

}

fun printCapSuperior(edad: Int) {
    repeat(edad) {
        print("=")
    }
    println()
}

fun printCapInferior(edad: Int) {

    repeat(edad) {
        print("@")

    }
    println()

}