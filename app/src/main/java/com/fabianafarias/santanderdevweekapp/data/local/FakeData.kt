package com.fabianafarias.santanderdevweekapp.data.local

import com.fabianafarias.santanderdevweekapp.data.Cartao
import com.fabianafarias.santanderdevweekapp.data.Cliente
import com.fabianafarias.santanderdevweekapp.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Maria")
        val cartao = Cartao("0123 4567 8901 2345")
        return Conta(
            "012345678-9",
            "1234",
            "R$ 1.000,00",
            "3.500,00",
            cliente,
            cartao
        )
    }
}