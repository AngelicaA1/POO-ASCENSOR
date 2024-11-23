
package com.mycompany.acsensorpoo;

import javax.swing.JOptionPane;

public class Puerta {
    private boolean estadoAbierto;
    private boolean hayObstaculo;

    public Puerta() {
        this.estadoAbierto = false;
        this.hayObstaculo = false;
    }

    public void abrir() {
        if (!hayObstaculo) {
            estadoAbierto = true;
            JOptionPane.showMessageDialog(null, "Puerta abierta.");
        } else {
            JOptionPane.showMessageDialog(null, "Obstáculo detectado. No se puede abrir la puerta.");
        }
    }

    public void cerrar() {
        estadoAbierto = false;
        JOptionPane.showMessageDialog(null, "Puerta cerrada.");
    }

    public void mantenerAbierta() {
        if (estadoAbierto) {
            JOptionPane.showMessageDialog(null, "La puerta se mantendrá abierta por más tiempo.");
        } else {
            JOptionPane.showMessageDialog(null, "La puerta no está abierta. No se puede mantener abierta.");
        }
    }

    public void setHayObstaculo(boolean hayObstaculo) {
        this.hayObstaculo = hayObstaculo;
    }

    public boolean isAbierta() {
        return estadoAbierto;
    }
}

