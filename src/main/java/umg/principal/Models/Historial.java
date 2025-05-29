package umg.principal.Models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Historial {
    private long id;
    private long turnoId;
    private java.time.LocalDateTime fechaFinalizacion;
    private String observaciones;

}
