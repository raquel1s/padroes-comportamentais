package org.example.observer;

import java.util.ArrayList;

public class Assinante implements Observer {

    private String nome;
    private ArrayList<Categoria> categorias;

    public Assinante(String nome) {
        this.nome = nome;
        categorias = new ArrayList<>();
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public void update(String noticia, Categoria categoria) {
        System.out.println("Última notícia de " + categoria +" para " + this.nome + ": " + noticia);
    }
}
