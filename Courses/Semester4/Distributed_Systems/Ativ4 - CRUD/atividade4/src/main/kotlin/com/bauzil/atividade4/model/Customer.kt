package kotlin.com.bauzil.atividade4.model

data class Customer(
    var firstName: String = "",
    var lastName: String = "",
    var cpf: String,
    var email: String = "",
    var password: String = "",
    var address: Address = Address(),
    var credits: List<Credit> = mutableListOf(),
    var id: Long? = null
)