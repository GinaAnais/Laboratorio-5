package Actividad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        gestor.agregarTarea(new Tarea("Hacer informe", 2));
        gestor.agregarTarea(new Tarea("Preparar presentación", 1));
        gestor.agregarTarea(new Tarea("Enviar correo", 3));

        // Eliminar una tarea
        gestor.eliminarTarea(new Tarea("Enviar correo", 3));

        System.out.println("Tareas actuales:");
        gestor.imprimirTareas();

        // Verificar si una tarea existe
        boolean existe = gestor.contieneTarea(new Tarea("Hacer informe", 2));
        System.out.println("\n¿Existe la tarea 'Hacer informe'? " + (existe ? "Sí" : "No"));

        // Invertir las tareas
        gestor.invertirTareas();
        System.out.println("\nInvertir tareas:");
        gestor.imprimirTareas();

        // Transferir tareas completadas a otra lista
        List<Tarea> tareasCompletadas = new ArrayList<>();
        Tarea tareaCompletada = new Tarea("Hacer informe", 2);
        if (gestor.eliminarTarea(tareaCompletada)) {
            tareasCompletadas.add(tareaCompletada);
        }


        System.out.println("\nTareas actuales después de completar una:");
        gestor.imprimirTareas();

        System.out.println("\nTareas completadas:");
        for (Tarea t : tareasCompletadas) {
            System.out.println(t);
        }
    }
}
