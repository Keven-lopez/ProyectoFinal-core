package umg.principal.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Turno {
    private Long id;
    private LocalDateTime fechaCreacion;
    private String estado;
    private Long clienteId;
    private Long servicioId;
}
