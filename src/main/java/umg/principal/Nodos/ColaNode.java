package umg.principal.Nodos;

import lombok.Getter;
import lombok.Setter;
import umg.principal.Models.Turno;

@Getter
@Setter
public class ColaNode {
    private Turno turno;
    private ColaNode next;

    public ColaNode(Turno turno) {
        this.turno = turno;
        this.next = null;
    }
}
