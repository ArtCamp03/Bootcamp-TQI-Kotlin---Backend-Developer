package me.dio.credit.aplication.system.dto

import me.dio.credit.aplication.system.entity.Credit
import java.math.BigDecimal
import java.util.UUID

data class CreditViewList(
    var creditCode: UUID,
    var creditValue: BigDecimal,
    var numberOfInstallments: Int
) {
    constructor(credit: Credit) : this (
        creditCode = credit.creditCode,
        creditValue = credit.creditValue,
        numberOfInstallments = credit.numberOfInstallments
    )
}
