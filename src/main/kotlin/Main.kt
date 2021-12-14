fun main() {


    var mensaje :String ="felicidades"
    var edad = 30
    printMen(mensaje)
    printVelas(edad)
    printCapSup(edad)
    printCapInf(edad)

    printMen(mensaje)

}

fun printMen(mensaje:String) {
    return
}

fun printVelas(edad: Int) {

    repeat(edad) {
        print(",")
    }
    println()


    repeat(edad) {
        print("|")
    }
    println()

}

fun printCapSup(edad: Int) {
    repeat(edad) {
        print("=")
    }
    println()
}

fun printCapInf(edad: Int) {

    repeat(edad) {
        print("@")
    }
    println()

}