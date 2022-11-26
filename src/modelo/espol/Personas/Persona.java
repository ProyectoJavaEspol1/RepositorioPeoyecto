package modelo.espol.Personas;

public abstract class Persona {

    protected String nombre;
    protected String cedula;
    protected String telefono;
    protected String email;

    //Constructores

    public Persona(String nombre,String cedula,String telefono,String email){
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //ToString
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nCedula: "+cedula+"\nTelefono: "+telefono+"\nEmail: "+email;
    }

}
