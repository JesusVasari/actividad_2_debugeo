fun main() {
    val c1 = readLine()!!.toInt()
    val c2 = readLine()!!.toInt()
    var v1 = intArrayOf(c1)
    var v2 = intArrayOf(c2)

    val arr = Array(2) { IntArray(c1) }

    v1 = inicia_array(c1)
    v2 = inicia_array(c2)


}

fun inicia_array(columna: Int): IntArray {
    var array = intArrayOf(columna)
    for (i in 0..columna - 1) {
        array[i] = 2 * i + columna
    }
    return array
}

fun leer_array(v1: IntArray, v2: IntArray) {
    for (i in v1) {
        println(i)
    }

    for (j in v2) {
        println(j)
    }
}

fun doble_array(v1: IntArray, v2: IntArray): Array<IntArray> {
    var matriz = Array(2) { IntArray(v1.size) }
    return matriz
}


