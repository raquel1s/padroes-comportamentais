package org.example.observer;

public class Main {

    public static void main(String[] args) {
        Noticias n = new Noticias();

        Assinante assinante1 = new Assinante("Raquel");
        Assinante assinante2 = new Assinante("Julia");
        Assinante assinante3 = new Assinante("Hellen");

        n.adicionarAssinante(assinante1, Categoria.TECH);
        n.adicionarAssinante(assinante1, Categoria.ESPORTE);

        n.adicionarAssinante(assinante2, Categoria.TECH);
        n.adicionarAssinante(assinante2, Categoria.POLITICA);

        n.adicionarAssinante(assinante3, Categoria.POLITICA);
        n.adicionarAssinante(assinante3, Categoria.ESPORTE);

        n.notificar("Chatgpt caiu.", Categoria.TECH);
        n.notificar("Neymar não vai jogar a copa", Categoria.ESPORTE);
        n.notificar("Bolsonaro foi preso!", Categoria.POLITICA);
    }
}
