/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
import kotlinx.coroutines.*

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    return 0
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    return 0
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println()
}