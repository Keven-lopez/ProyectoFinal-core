package umg.principal.EstructurasDeDatos;

import umg.principal.Nodos.ColaNode;
import umg.principal.Models.Turno;
import lombok.ToString;

@ToString
public class ColaDeTurnos {
    private ColaNode front;
    private ColaNode end;
    private int size;

    public ColaDeTurnos() {
        front = end = null;
        size = 0;
    }

    public void insertar(Turno turno) {
        ColaNode a;
        a = new ColaNode(turno);

        if (colaVacia()) {
            front = a;
        } else {
            end.setNext(a);
        }
        end = a;
    }

    public Turno quitar() {
        Turno turno;
        if (!colaVacia()) {
            turno = front.getTurno();
            front = front.getNext();
        } else {
            return null;
        }

        return turno;
    }

    public void buscarCola() {
        ColaNode current = front;
        while (current != null) {
            System.out.println(current.getTurno());
            current = current.getNext();
        }

    }

    public boolean deleteById(int id) {
        if (front == null) return false;

        if (front.getTurno().getId() == id) {
            front = front.getNext();
            return true;
        }

        ColaNode actual = front;
        while (actual.getNext() != null) {
            if (actual.getNext().getTurno().getId() == id) {
                actual.setNext(actual.getNext().getNext());
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public boolean colaVacia() {
        return front == null;
    }
}
