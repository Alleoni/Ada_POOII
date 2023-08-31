package com.ada.pooii.sorteador;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteador {


    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    public String sortear() {
        if (elementos.isEmpty()) {
            return null;
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(elementos.size());
        String elementoSorteado = elementos.remove(indiceSorteado);
        return elementoSorteado;
    }

    public List<Grupo> agrupar(int numeroDeGruposEsperados) {

        return null;
    }
}
