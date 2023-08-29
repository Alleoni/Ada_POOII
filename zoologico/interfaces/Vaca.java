package com.ada.pooii.zoologico.interfaces;

public class Vaca implements Animal, Amamentador {

    @Override
    public void alimentar() {
        amamentar();
    }

    @Override
    public void movimentar() {
    }
}
