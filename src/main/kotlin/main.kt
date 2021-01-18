fun main() {
    usualUser(11000)
    musicLover(6000)

}

fun usualUser(buy: Int) {
    var lastPurchase = 1001
    if (lastPurchase in 0..1000) println("Сумма вашей покупки равна $buy рублей")
    if (lastPurchase in 1001..10000) println("Сумма вашей покупки с учетом скидки равна ${buy - 100} рублей")
    if (lastPurchase > 10000) println("Сумма вашей покупки с учетом скидки равна ${buy * 0.95} рублей")
}

fun musicLover(buyMusicLover: Int) {
    var lastPurchaseMusicLover = 5000
    val discount = 0.99
    if (lastPurchaseMusicLover in 0..1000) println("Сумма вашей покупки равна ${buyMusicLover * discount} рублей")
    if (lastPurchaseMusicLover in 1001..10000) println("Сумма вашей покупки с " +
            "учетом скидки равна ${(buyMusicLover - 100) * discount} рублей")
    if (lastPurchaseMusicLover > 10000) println("Сумма вашей покупки " +
            "с учетом скидки равна ${(buyMusicLover * 0.95) * discount} рублей")
}



