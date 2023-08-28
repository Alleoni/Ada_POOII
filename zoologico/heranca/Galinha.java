package com.ada.pooii.zoologico.heranca;

public class Galinha extends Aves {

    @Override
    public void voar() {
        System.out.println("Planando");
    }

    @Override
    public void movimentar() {
        System.out.println("Ciscando");
    }
}
