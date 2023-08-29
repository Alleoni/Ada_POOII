package com.ada.pooii.zoologico.interfaces;

public class Morcego implements Voador, Amamentador {
    @Override
    public void alimentar() {
        amamentar();
    }

    @Override
    public void movimentar() {
        voar();
    }
}
