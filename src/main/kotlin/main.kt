package ru.netology //Задача 1 -> комиссия за перевод

fun main() {
    var amount = 100 // Сумма за все переводы
    var transferAmount = 50 // Перевод на сумму
    var commission = 0
    val commissionPercentage = 0.75 // Комимиссия за перевод.
    val minimumCommission = 35  //Минимальная комиссия есди сумма перевода меньше минимально облагаесой налогом
    val commissionMax = (minimumCommission / commissionPercentage * 100).toInt() //Расчет минимальной платы
    if (transferAmount < minimumCommission) {
        println("Перевод на сумму $transferAmount руб. невозможен. " +
                "\nTак как он меньше минимальной комиссии:  $minimumCommission руб.")
    } else {
        if (commissionMax > transferAmount) {
            commission = minimumCommission
            transferAmount -= minimumCommission
        } else {
            commission = (transferAmount * commissionPercentage / 100).toInt()
            transferAmount -= commission

        }
        amount += transferAmount
        println("Вы перевели $transferAmount руб.")
        println("Перевод выполнен успешно, сумма комиссии составила $commission руб.")
    }
}
