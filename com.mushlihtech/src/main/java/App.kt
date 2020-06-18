fun main(){

    val bilanganAwal = 12
    val operator: String? = readLine()
    val bilanganAkhir  = 15
    val operator1 = operator?.toInt()

    if (operator1 == 1){

        val hasil = bilanganAwal + bilanganAkhir

        print("hasil dari $bilanganAwal + $bilanganAkhir = $hasil")

    }else if(operator1 == 2){

        val hasil = (bilanganAwal - bilanganAkhir)

        print("hasil dari $bilanganAwal $bilanganAkhir = $hasil")

    }else if (operator1 == 3){

        val hasil = bilanganAwal / bilanganAkhir

        print(hasil)

    }else if (operator1 == 4){

        val hasil = bilanganAwal * bilanganAkhir

        print(hasil)

    }else if(operator1 == 5){

        val hasil = bilanganAwal % bilanganAkhir

        print(hasil)

    }else {

        print("anda salah")

    }

}