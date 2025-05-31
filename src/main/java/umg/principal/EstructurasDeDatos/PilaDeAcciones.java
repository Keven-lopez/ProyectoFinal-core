package umg.principal.EstructurasDeDatos;

import lombok.ToString;
import umg.principal.Nodos.PilaNode;
import umg.principal.Models.Turno;

@ToString
public class PilaDeAcciones {

    private PilaNode top;

    public PilaDeAcciones() {
        top = null;
    }

    public boolean pilaVacia() {
        return top == null;
    }

    public void insertar(Turno turno) {
        PilaNode pila;
        pila = new PilaNode(turno);
        pila.setNext(top);
        top = pila;
    }

    public Turno quitar() {
        if (pilaVacia()) {
            return null;
        }

        Turno t = top.getTurno();
        top = top.getNext();
        return t;
    }

    public void limpiarPila() {
        PilaNode t;
        while (!pilaVacia()) {
            t = top;
            top = top.getNext();
            t.setNext(null);
        }
    }
}