fun main () {

}

//1 opção (comparação)

fun bonus (cargo: String): Float {
    return if (cargo == "Gerente") {
        2000f
    } else if (cargo == "Coordenador") {
        1500f
    } else if (cargo == "Engenheiro") {
        1000f
    } else if (cargo == "Estagiário") {
        500f
    } else {
        0f
    }

}

//2 opção com When

fun bonusWhen (cargo:String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro" -> 1000f
        "Estagiário" -> 500f
        
        else -> 0f
    }
}