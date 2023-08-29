package com.ada.pooii.zoologico.interfaces;

public class Ornitorrinco implements Nadador, Amamentador, Animal {



    @Override
    public void movimentar() {
        nadar();
    }

    @Override
    public void alimentar() {
        amamentar();
    }
}

