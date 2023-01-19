const val firstLevelDiscount = 100 //RUB
const val firstLevelDiscountStart = 1_001
const val secondLevelDiscount = 0.05 //percent
const val secondLevelDiscountStart = 10_001

fun main() {
    val amount = 5000
    val regularBuyer = true
    println(totalCheck(amount, regularBuyer))
}

fun totalCheck(amount: Int, regularBuyer: Boolean): Int {
    val amountWithAction = if (amount >= secondLevelDiscountStart) {
        (amount * (1 - secondLevelDiscount)).toInt()
    } else if (amount >= firstLevelDiscountStart) {
        amount - firstLevelDiscount
    } else {
        amount
    }
    return if (regularBuyer) (amountWithAction * 0.99).toInt() else amountWithAction
}