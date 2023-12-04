package com.bauzil.atividade4.model

import

data class Credit(
    val creditCode: UUID = UUID.randomUUID(),
    val creditValue: BigDecimal = BigDecimal.ZERO,
    val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int = 0,
    val status: Status,
    val customer: Customer? = null,
    val id: Long? = null
)
