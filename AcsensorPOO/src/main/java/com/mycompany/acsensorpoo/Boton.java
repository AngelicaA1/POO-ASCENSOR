package com.mycompany.acsensorpoo;

import javax.swing.JOptionPane;

public class Boton implements BotonInterface {
    private boolean iluminado;

    public Boton() {
        this.iluminado = false;
    }

    @Override
    public void presionar() {
        this.iluminado = true;
        JOptionPane.showMessageDialog(null, "Botón presionado. Iluminado: " + iluminado);
    }

    @Override
    public void apagar() {
        this.iluminado = false;
    }

    @Override
    public boolean isIluminado() {
        return iluminado;
    }
}
