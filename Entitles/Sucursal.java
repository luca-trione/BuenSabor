import java.time.LocalTime;

public class Sucursal {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.domicilio = domicilio;
    }


}
