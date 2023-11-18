package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    var num1 = 100
    var num2 = 20

    try{
        val result = num1 / num2
        println(result)
    } catch (error:ArithmeticException){
        println(error)
    }


}
