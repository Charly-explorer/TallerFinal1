package Listas;


import java.util.Stack;

    public class StackList {
    private Stack<String> historial;

    public StackList() {
        historial = new Stack<>();
    }

    public void registrarReparacion(String reparacion) {
        historial.push(reparacion);
        System.out.println("Reparación registrada: " + reparacion);
    }

    public String deshacerReparacion() {
        if (!historial.isEmpty()) {
            String ultimaReparacion = historial.pop();
            System.out.println("Última reparación deshecha: " + ultimaReparacion);
            return ultimaReparacion;
        } else {
            System.out.println("No hay reparaciones para deshacer.");
            return null;
        }
    }

    public void mostrarHistorial() {
        if (!historial.isEmpty()) {
            System.out.println("Historial de reparaciones:");
            for (String reparacion : historial) {
                System.out.println(reparacion);
            }
        } else {
            System.out.println("El historial está vacío.");
        }
    }
}
