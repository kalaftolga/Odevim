fun main(args: Array<String>) {

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var tekToplam = 0
    var tekCarpim = 1
    var ciftToplam = 0

    for (i in 1..350 step 2) { // 1'den 350'ye kadar olan tek sayıların toplamı ve çarpımı
        tekToplam += i
        tekCarpim *= i
    }

    for (i in 2..350 step 2) { // 1'den 350'ye kadar olan çift sayıların karelerinin toplamı
        ciftToplam += i * i
    }

    println("1'den 350'ye kadar olan tek sayıların toplamı: $tekToplam")
    println("1'den 350'ye kadar olan tek sayıların çarpımı: $tekCarpim")
    println("1'den 350'ye kadar olan çift sayıların karelerinin toplamı: $ciftToplam")
}