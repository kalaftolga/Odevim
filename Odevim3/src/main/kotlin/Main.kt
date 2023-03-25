fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val sayi = 7
    val faktoriyel = faktoriyelHesapla(sayi)
    println("$sayi! = $faktoriyel")
}

fun faktoriyelHesapla(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * faktoriyelHesapla(n-1)
    }
}