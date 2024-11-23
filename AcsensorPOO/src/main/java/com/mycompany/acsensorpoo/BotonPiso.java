
package com.mycompany.acsensorpoo;

public class BotonPiso extends Boton {
    private String direccion; // "Subida" o "Bajada"

    public BotonPiso(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
