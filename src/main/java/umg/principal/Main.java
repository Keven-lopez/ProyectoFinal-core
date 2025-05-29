package umg.principal;

import umg.principal.EstructurasDeDatos.ColaDeTurnos;
import umg.principal.Models.Turno;

import java.time.LocalDateTime;

import umg.principal.EstructurasDeDatos.ArbolDeServicios;
import umg.principal.Models.Servicio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*ColaDeTurnos cola = new ColaDeTurnos();

        // Create a few Turno objects
        Turno t1 = new Turno(1L, LocalDateTime.now(), "PENDING", 101L, 201L);
        Turno t2 = new Turno(2L, LocalDateTime.now(), "IN_PROGRESS", 102L, 202L);
        Turno t3 = new Turno(3L, LocalDateTime.now(), "COMPLETED", 103L, 203L);

        // Insert them into the queue
        cola.insert(t1);
        cola.insert(t2);
        cola.insert(t3);


        // Check if the queue is empty
        System.out.println("Queue empty? " + cola.colaVacia());

        // Remove and print each Turno
        Turno removed;
        while (!cola.colaVacia()) {
            removed = cola.quitar();
            System.out.println("Removed: " + removed);
        }

        // Final state
        System.out.println("Queue empty after removals? " + cola.colaVacia());
    }*/

        ArbolDeServicios bst = new ArbolDeServicios();

        bst.insert(new Servicio(2, "Electricidad", "Servicios eléctricos"));
        bst.insert(new Servicio(1, "Agua", "Servicio de agua potable"));
        bst.insert(new Servicio(3, "Internet", "Conexión de internet"));

        System.out.println("Recorrido in-order:");
        bst.inOrden();

        System.out.println("\nBuscando servicio con ID 2:");
        Servicio resultado = bst.buscar(2);
        System.out.println(resultado != null ? resultado : "No encontrado");
    }
}