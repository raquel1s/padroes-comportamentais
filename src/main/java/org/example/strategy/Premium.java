package org.example.strategy;

public class Premium implements PlanoStrategy {
    @Override
    public double calcularPreco() {
        return 59.90;
    }
}
