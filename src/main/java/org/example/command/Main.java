package org.example.command;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Impressao impressao = new Impressao();
        Comando comando = new ComandoImprimir(impressao);

        comando.executar();
        comando.desfazer();
    }

}
