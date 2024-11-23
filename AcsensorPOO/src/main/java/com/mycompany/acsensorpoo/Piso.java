
package com.mycompany.acsensorpoo;

public class Piso {
    private int numeroPiso;
    private BotonPiso botonSubida;
    private BotonPiso botonBajada;

    public Piso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
        this.botonSubida = new BotonPiso("Subida");
        this.botonBajada = new BotonPiso("Bajada");
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public BotonPiso getBotonSubida() {
        return botonSubida;
    }

    public BotonPiso getBotonBajada() {
        return botonBajada;
    }
}
