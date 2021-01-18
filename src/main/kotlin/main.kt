fun main() {
    usualUser(2000)
    musicLover(6000)

}

fun usualUser(buy: Int) {
    if (buy < 1000) println("Сумма вашей покупки равна $buy")
    if (buy > 1000) println("Сумма вашей покупки с учетом скидки равна ${buy - 100}")
    if (buy > 10000) println("Сумма вашей покупки с учетом скидки равна ${buy * 0.95}")
}

fun musicLover(buyMusicLover: Int) {
    val discount = 0.99
    if (buyMusicLover < 1000) println("Сумма вашей покупки равна ${buyMusicLover * discount}")
    if (buyMusicLover > 1000) println("Сумма вашей покупки с учетом скидки равна ${(buyMusicLover - 100) * discount}")
    if (buyMusicLover > 10000) println("Сумма вашей покупки с учетом скидки равна ${(buyMusicLover * 0.95) * discount}")
}



