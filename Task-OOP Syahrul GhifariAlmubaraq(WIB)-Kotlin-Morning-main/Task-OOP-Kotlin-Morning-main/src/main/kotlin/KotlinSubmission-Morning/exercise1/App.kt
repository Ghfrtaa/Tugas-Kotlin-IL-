package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile():Any {
    val nama_depan = "Syahrul"
    val nama_belakang = "Almubaraq"
    val umur = 21
    val status:Boolean = false
    // perintah!
   println("nama saya adalah : $nama_depan $nama_belakang")
    println("Umur saya adalah : $umur")
    if (status == true){
        println("Single")
    } else {
        println("Tidak single")
    }
return ""
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("My tim is : ")
    val groupId = "WIB(WaktuIndonesiaBahagia)"
    val groupMember = listOf("Syahrul","Naufal","Irfan","Tria","Angga","Aisyah","zulham","Bram","Raisa","Felicia","Fikri")
    val session = "Pagi(Morning)"
    println("Nama kelompok kami adalah : $groupId")
    println("Kelompok kami beranggotakan : $groupMember")
    println("Kita bergabung dalam sesi : $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggota = listOf("Syahrul","Naufal","Irfan","Tria","Angga","Aisyah","zulham","Bram","Raisa","Felicia","Fikri")
    print("Nama saya pada anggota ini adalah : ")
    println(anggota[0])
    return listOf()
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember() {
    val mentor = arrayOf<String>("kak reihan","kak malik")
    val countOfGroup = arrayOf<String>("Syahrul","Naufal","Irfan","Tria","Angga","Aisyah","zulham","Bram","Raisa","Felicia","Fikri")
    val total1 = mentor.count()
    val total2 = countOfGroup.count()
    val jumlah = total1 + total2
    print("Jumlah Member pada kelompok kami + kaka mentor itu ialah : ")
    println("$jumlah")
    val total = mentor + countOfGroup
    println("$total")

}

fun main() {
    myProfile()
    myTeam()
    totalMember()


    /*val myprofile = myProfile()
    *//*println("My team is : $myprofile")*//*
    val myTeam = myTeam()
    val totalMember = totalMember()*/


    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("WIB(WaktuIndonesiaBahagia)", listOf("Syahrul","Naufal","Irfan","Tria","Angga","Aisyah","zulham","Bram","Raisa","Felicia","Fikri"), "Pagi(Morning)")

}