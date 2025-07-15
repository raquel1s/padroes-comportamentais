package org.example.strategy;

public class Main {

    public static void main(String[] args) {

        CompraPlano plano = new CompraPlano(new Basico());
        plano.preco();

        CompraPlano plano2 = new CompraPlano(new Premium());
        plano2.preco();

        CompraPlano plano3 = new CompraPlano(new Padrao());
        plano3.preco();
    }
}
