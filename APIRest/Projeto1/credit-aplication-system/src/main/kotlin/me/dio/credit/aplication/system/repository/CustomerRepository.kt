package me.dio.credit.aplication.system.repository

import me.dio.credit.aplication.system.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {

}