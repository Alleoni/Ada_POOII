package com.ada.pooii.zoologico.interfaces;

public interface Voador {

    default void voar() {
        System.out.println("Voando");
    }
}
