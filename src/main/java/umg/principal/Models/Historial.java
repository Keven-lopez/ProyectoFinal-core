package umg.principal.Models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Historial {
    private int id;
    private int turnoId;
    private java.time.LocalDateTime fechaFinalizacion;
    private String observaciones;

}
