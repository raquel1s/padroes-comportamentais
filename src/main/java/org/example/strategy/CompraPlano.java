package org.example.strategy;

public class CompraPlano {

    PlanoStrategy plano;

    public CompraPlano(PlanoStrategy plano) {
        this.plano = plano;
    }

    void preco(){
        System.out.println("Total do plano: R$ " + plano.calcularPreco());
    }

}
