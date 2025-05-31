package umg.principal.Models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Turno {
    private int id;
    private LocalDateTime fechaCreacion;
    private String estado;
    private int clienteId;
    private int servicioId;
}
