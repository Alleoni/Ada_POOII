package com.ada.pooii.sorteador;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeSorteios {

    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        elementos.add("ameixa");
        elementos.add("melancia");
        elementos.add("fruta do conde");
        elementos.add("mirtilo");
        Sorteador sorteador = new Sorteador(elementos);
        List<Grupo> grupos = sorteador.agrupar(3);
        System.out.println(grupos);

    }
}
