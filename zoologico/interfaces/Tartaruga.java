package com.ada.pooii.zoologico.interfaces;

public class Tartaruga implements Animal, Nadador {
    @Override
    public void alimentar() {

    }

    @Override
    public void movimentar() {
        nadar();
    }
}
