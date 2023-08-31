package com.ada.pooii.sorteador;

import java.util.ArrayList;
import java.util.List;

public class Sorteador {
    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {
        return elementos.get(0);

    }

    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador sorteador = new Sorteador(elementos);
        while (!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
            elementos.remove(elementos.get(0));
        }
        System.out.println(elementos);
    }
}
