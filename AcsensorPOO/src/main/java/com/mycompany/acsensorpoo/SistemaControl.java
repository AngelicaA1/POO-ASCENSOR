
package com.mycompany.acsensorpoo;



import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaControl {
    private Ascensor ascensor;
    private ArrayList<Piso> pisos;

    public SistemaControl(int totalPisos) {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        for (int i = 0; i < totalPisos; i++) {
            pisos.add(new Piso(i));
        }
    }

    public void iniciar() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("1. Solicitar ascensor\n2. Mover ascensor\n3. Mantener puertas abiertas\n4. Emergencia\n5. Salir");
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.");
                break;
            }
            switch (opcion) {
                case "1" -> {
                    String pisoStr = JOptionPane.showInputDialog("Ingrese el piso de solicitud:");
                    if (pisoStr == null || pisoStr.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida o cancelada.");
                        break;
                    }
                    try {
                        int piso = Integer.parseInt(pisoStr);
                        ascensor.agregarSolicitud(piso);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
                    }
                }
                case "2" -> ascensor.mover();
                case "3" -> ascensor.mantenerPuertaAbierta();
                case "4" -> ascensor.detenerEmergencia();
                case "5" -> JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (!"5".equals(opcion));
    }
}
