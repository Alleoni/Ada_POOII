package com.ada.pooii.zoologico.heranca;

public class Ornitorrinco extends Mamifero {

    public void nadar() {
        System.out.println("Nadando");
    }
    @Override
    public void movimentar() {
        nadar();
    }
}
