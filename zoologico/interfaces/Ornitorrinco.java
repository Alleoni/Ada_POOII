package com.ada.pooii.zoologico.interfaces;

public class Ornitorrinco implements Nadador, Animal, Amamentador {


    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void alimentar() {
        amamentar();
    }
}

