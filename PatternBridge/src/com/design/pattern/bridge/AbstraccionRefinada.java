package com.design.pattern.bridge;

public class AbstraccionRefinada implements Abstraccion{
    private Implementador implementador;
    public AbstraccionRefinada(Implementador implementador){
        this.implementador = implementador;
    }
    public void operacion(){
        implementador.operacion();
    }
}
