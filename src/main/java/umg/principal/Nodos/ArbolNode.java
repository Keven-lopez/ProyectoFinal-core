package umg.principal.Nodos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import umg.principal.Models.Servicio;

@Getter
@Setter
public class ArbolNode {
    public Servicio servicio;
    private ArbolNode left, right;

    public ArbolNode(Servicio servicio){
        this.servicio = servicio;
        this.left = null;
        this.right = null;
    }
}
