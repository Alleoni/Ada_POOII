package com.ada.pooii.zoologico.interfaces;

public interface Animal {

    default void alimentar() {
        System.out.println("Alimentando");
    }

    void movimentar();
}
