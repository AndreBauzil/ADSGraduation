package com.bauzil.atividade4.model

import jakarta.persistence.*

@Entity
@Table
data class Customer(
        @Column(nullable = false) var firstName: String = "",
        @Column(nullable = false) var lastName: String = "",
        @Column(nullable = false, unique = true) var cpf: String,
        @Column(nullable = false, unique = true) var email: String = "",
        @Column(nullable = false) var password: String = "",
        @Column(nullable = false) var address: Address = Address(),
        @Column(nullable = false) @OneToMany(fetch = FetchType.LAZY) var credits: List<Credit> = mutableListOf(),
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null
)