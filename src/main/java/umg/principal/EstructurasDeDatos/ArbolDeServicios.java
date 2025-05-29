package umg.principal.EstructurasDeDatos;

import umg.principal.Nodos.ArbolNode;
import umg.principal.Models.Servicio;

public class ArbolDeServicios {
    private ArbolNode root;

    public void insert(Servicio servicio) {
        root = insertRec(root, servicio);
    }

    private ArbolNode insertRec(ArbolNode node, Servicio servicio) {
        if (node == null) {
            return new ArbolNode(servicio);
        }

        if (servicio.compareTo(node.getServicio()) < 0) {
            ArbolNode left = insertRec(node.getLeft(), servicio);
            node.setLeft(left);
        } else if (servicio.compareTo(node.getServicio()) > 0) {
            ArbolNode right = insertRec(node.getRight(), servicio);
            node.setRight(right);
        }

        return node;
    }

    public Servicio buscar(long id) {
        return buscarRec(root, id);
    }

    private Servicio buscarRec(ArbolNode nodo, long id) {
        if (nodo == null) return null;
        if (id == nodo.getServicio().getId()) return nodo.getServicio();
        return id < nodo.getServicio().getId() ? buscarRec(nodo.getLeft(), id) : buscarRec(nodo.getRight(), id);
    }

    public void inOrden() {
        inOrdenRec(root);
    }

    private void inOrdenRec(ArbolNode nodo) {
        if (nodo != null) {
            inOrdenRec(nodo.getLeft());
            System.out.println(nodo.getServicio());
            inOrdenRec(nodo.getRight());
        }
    }

}
