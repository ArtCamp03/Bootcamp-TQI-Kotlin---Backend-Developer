package me.dio.credit.aplication.system.service.imnpl

import me.dio.credit.aplication.system.entity.Customer
import me.dio.credit.aplication.system.exception.BusinessException
import me.dio.credit.aplication.system.repository.CustomerRepository
import me.dio.credit.aplication.system.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer =
        this.customerRepository.save(customer)

    override fun findById(id: Long): Customer {
        return this.customerRepository.findById(id).orElseThrow {
            throw BusinessException("Id $id not found")
        }
    }

    override fun delete(id: Long) {
        this.customerRepository.deleteById(id)
    }

}