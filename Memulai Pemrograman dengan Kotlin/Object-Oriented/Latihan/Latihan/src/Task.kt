/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
class Cat(private val name: String) {
    // TODO 1
    var sleep: Boolean = false

    fun toSleep() {
        println()
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}