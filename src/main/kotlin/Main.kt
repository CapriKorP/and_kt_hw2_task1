fun main() {
    val amount = 4_666
    val minCommission = 35
    val commissionPercent = 0.75

    var summaryCommission = if (amount * commissionPercent / 100 <= minCommission) minCommission.toDouble() else amount * commissionPercent / 100
    println("Комиссия составила: $summaryCommission руб.")
}