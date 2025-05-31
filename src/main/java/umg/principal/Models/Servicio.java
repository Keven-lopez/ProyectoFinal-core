package umg.principal.Models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Servicio implements Comparable<Servicio>{
        private int id;
        private String nombre;
        private String descripcion;

        @Override
        public int compareTo(Servicio o) {
                if (id == o.getId()) {
                        return 0;
                } else if (id < o.getId()) {
                        return -1;
                } else {
                        return 1;
                }
        }
}
