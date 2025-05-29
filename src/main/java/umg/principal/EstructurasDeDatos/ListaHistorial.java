package umg.principal.EstructurasDeDatos;

import umg.principal.Models.Historial;

import java.util.ArrayList;
import java.util.List;

public class ListaHistorial {
    private List<Historial> historialList;

    public ListaHistorial() {
        this.historialList = new ArrayList<>();
    }

    public void addHistorial(Historial historial) {
        historialList.add(historial);
    }

    public List<Historial> getAll() {
        return historialList;
    }

    public Historial findById(long turnoId) {
        for (Historial h : historialList) {
            if (h.getTurnoId() == turnoId) {
                return h;
            }
        }
        return null;
    }

    public boolean deleteByID(long turnoId) {
        return historialList.removeIf(h -> h.getTurnoId() == turnoId);
    }
}
