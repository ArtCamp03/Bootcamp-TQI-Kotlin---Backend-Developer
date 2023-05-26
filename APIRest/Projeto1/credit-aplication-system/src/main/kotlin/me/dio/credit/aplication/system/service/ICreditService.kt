package me.dio.credit.aplication.system.service

import me.dio.credit.aplication.system.entity.Credit
import java.util.UUID

interface ICreditService {

    fun save(credit: Credit): Credit
    fun findAllByCustomer(customerId: Long): List<Credit>
    fun findByCreditCod(customerId: Long,creditCode: UUID): Credit

}