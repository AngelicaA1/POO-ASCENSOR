
package com.mycompany.acsensorpoo;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ascensor implements MovimientoInterface {
    private int pisoActual;
    private String direccion; 
    private Puerta puerta;
    private ArrayList<Integer> solicitudes;

    public Ascensor() {
        this.pisoActual = 0;
        this.direccion = "Quieto";
        this.puerta = new Puerta();
        this.solicitudes = new ArrayList<>();
    }

    @Override
    public void mover() {
        if (!solicitudes.isEmpty()) {
            int destino = solicitudes.get(0);
            direccion = destino > pisoActual ? "Subiendo" : "Bajando";
            JOptionPane.showMessageDialog(null, "Moviendo al piso: " + destino + ". Dirección: " + direccion);
            pisoActual = destino;
            solicitudes.remove(0);
            puerta.abrir();
        } else {
            JOptionPane.showMessageDialog(null, "No hay solicitudes pendientes.");
        }
    }

    @Override
    public void agregarSolicitud(int piso) {
        if (!solicitudes.contains(piso)) {
            solicitudes.add(piso);
            JOptionPane.showMessageDialog(null, "Solicitud añadida para el piso: " + piso);
        } else {
            JOptionPane.showMessageDialog(null, "El piso ya está en la lista de solicitudes.");
        }
    }

    public void detenerEmergencia() {
        JOptionPane.showMessageDialog(null, "Emergencia detectada. Deteniendo el ascensor en el piso más cercano.");
        puerta.abrir();
    }

    public void mantenerPuertaAbierta() {
        puerta.mantenerAbierta();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

