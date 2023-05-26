package me.dio.credit.aplication.system.service.imnpl

import me.dio.credit.aplication.system.entity.Credit
import me.dio.credit.aplication.system.repository.CreditRepository
import me.dio.credit.aplication.system.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
): ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> = this.creditRepository.findAllByCustomer(customerId)


    override fun findByCreditCod(customerId: Long, creditCode: UUID): Credit {
        val credit : Credit = this.creditRepository.findCreditCode(creditCode) ?:
        throw RuntimeException("creditCode $creditCode not found")
        return if (credit.customer?.id == customerId) credit
        else throw RuntimeException("Contact admin")
    }

}