package modelo.espol.Personas;

import modelo.espol.Enums.*;

import java.time.LocalDateTime;

public class Colaboradores extends Persona {
    private String puestoTrabajo;
    private TipoEmpleado tipoEmpleado;
    private Estado estado;
    private String fechaInicio;  //Los pondre String por ahora
    private String fechaFin;      // Los pondre String por ahora
    //Constructor
    public Colaboradores(String nombre,String cedula,String telefono, String email,String puestoTrabajo,TipoEmpleado tipoEmpleado,Estado estado,String fechaInicio,String fechaFin){
        super(nombre, cedula, telefono, email);
        this.puestoTrabajo=puestoTrabajo;
        this.tipoEmpleado = tipoEmpleado;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

    }

    @Override
    public String toString() {
        return super.toString() + "puestoTrabajo='" + puestoTrabajo + '\'' + ", tipoEmpleado=" + tipoEmpleado + ", estado=" + estado + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }
}
