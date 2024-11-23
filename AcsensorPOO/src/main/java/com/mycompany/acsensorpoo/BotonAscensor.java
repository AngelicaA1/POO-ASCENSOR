
package com.mycompany.acsensorpoo;

public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}
