package org.example.strategy;

public class Basico implements PlanoStrategy {
    @Override
    public double calcularPreco() {
        return 20.90;
    }
}
