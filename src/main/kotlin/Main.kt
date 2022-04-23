//fungsi untuk membuat gambar pertama yaitu piramida bintang
private fun gambarPertama(){
    val med = (15 + 1)/2
    for (i in 1..8){
        for(k in 1..15){
            if(k >= med - (i - 1) && k <= med + (i - 1)){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}
//fungsi untuk membuat gambar kedua yaitu piramida terbalik bintang
private fun gambarKedua(){
    val med = (15 + 1)/2
    for(i in 8.downTo(1)){
        for(k in 1..15){
            if(k >= med - (i - 1) && k <= med + (i - 1)){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}
//fungsi untuk membuat gambar ketiga yaitu piramida bolak-balik bintang
private fun gambarKetiga(){
    val med = (15 + 1)/2
    gambarPertama()
    for(i in 7.downTo(1)){
        for(k in 1..15){
            if(k >= med - (i - 1) && k <= med + (i - 1)){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }
}
//fungsi untuk membuat gambar keempat yaitu X bintang
private fun gambarKeempat(){
    val med = (15 + 1)/2
    for(i in 8.downTo(1)){
        for(k in 1..15){
            if(k == med - (i - 1) || k == med + (i - 1)){
                print("*")
            }else{
                print(" ")
            }
        }
        println("")
    }
    for(i in 1..7){
        for (k in 1..15){
            if(k == med - i || k == med + i){
                print("*")
            }else{
                print(" ")
            }
        }
        println("")
    }
}
//fungsi untuk membuat gambar kelima yaitu piramida bintang
private fun gambarKelima(){
    for(i in 1..8){
        for (k in 1..i){
            print("*")
        }
        println("")
    }
}
//fungsi untuk membuat gambar keenam yaitu plus bintang
private fun gambarKeenam(){
    for(i in 1..6){
        for(k in 1..9){
            if(k in 4..6 && (i == 1 || i == 2 || i == 5 || i == 6)){
                print("*")
            }else if(k in 1..9 && (i == 3 || i == 4)){
                print("*")
            }else{
                print(" ")
            }
        }
        println("")
    }

}
//main function
fun main(){
    println("Gambar Pertama (Piramida Bintang):")
    gambarPertama()
    println("Gambar Kedua (Piramida Terbalik Bintang):")
    gambarKedua()
    println("Gambar Ketiga (Piramida Bolak-Balik Bintang):")
    gambarKetiga()
    println("Gambar Keempat (X Bintang):")
    gambarKeempat()
    println("Gambar Kelima (Piramida Bintang):")
    gambarKelima()
    println("Gambar Keenam (Plus Bintang):")
    gambarKeenam()
}