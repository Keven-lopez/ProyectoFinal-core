package umg.principal.Nodos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import umg.principal.Models.Turno;

@ToString
@Getter
@Setter
public class PilaNode {
    private Turno turno;
    private PilaNode next;

    public PilaNode(Turno t) {
        turno = t;
        next = null;
    }
}
