package org.example.observer;

import java.util.ArrayList;

public class Noticias {

    private ArrayList<Assinante> assinantes = new ArrayList<>();

    void adicionarAssinante(Assinante assinante, Categoria categoria) {
        if(!assinantes.contains(assinante)){
            assinantes.add(assinante);
        }
        assinante.adicionarCategoria(categoria);
    }

    void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
        assinante.setCategorias(null);
    }

    void notificar(String noticia, Categoria categoria) {
        for(Assinante a : assinantes){
            for(Categoria c : a.getCategorias()){
                if(c.equals(categoria)){
                    a.update(noticia, categoria);
                }
            }
        }
    }
}
