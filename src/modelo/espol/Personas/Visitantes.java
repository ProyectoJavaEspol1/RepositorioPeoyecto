package modelo.espol.Personas;

public class Visitantes extends Persona{
    private boolean repartidor;
    private String empresa;
    private String sanciones;

    //Constructores


    public Visitantes(String nombre, String cedula, String telefono, String email,boolean repartidor,String empresa,String sanciones) {
        super(nombre, cedula, telefono, email);
        this.repartidor = repartidor;
        this.empresa = empresa;
        this.sanciones = sanciones;
    }
    //Getters && Setters

    public boolean isRepartidor() {
        return repartidor;
    }
    public void setRepartidor(boolean repartidor) {
        this.repartidor = repartidor;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getSanciones() {
        return sanciones;
    }
    public void setSanciones(String sanciones) {
        this.sanciones = sanciones;
    }

    @Override
    public String toString() {
        return super.toString() + "repartidor=" + repartidor + ", empresa='" + empresa + '\'' + ", sanciones='" + sanciones + '\'' + '}';
    }
}
