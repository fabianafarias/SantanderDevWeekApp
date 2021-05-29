package com.fabianafarias.santanderdevweekapp.data.local

import com.fabianafarias.santanderdevweekapp.data.Cartao
import com.fabianafarias.santanderdevweekapp.data.Cliente
import com.fabianafarias.santanderdevweekapp.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Fabiana")
        val cartao = Cartao("33333333")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2450,80",
            "4.120,00",
            cliente,
            cartao
        )
    }
}