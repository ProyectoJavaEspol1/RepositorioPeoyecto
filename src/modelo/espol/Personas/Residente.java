package modelo.espol.Personas;
import modelo.espol.Clases.*;
import modelo.espol.Enums.Estado;
import java.util.*;
public class Residente extends Persona {
    private Estado estado;
    private int manzana;
    private int villa;
    private int cantPersona;
    private String urbanizacion;

    //Constructor
    public Residente(String nombre, String cedula, String telefono, String email, int manzana, int villa, int cantPersona, Estado estado,String urbanizacion) {
        super(nombre, cedula, telefono, email);
        this.manzana = manzana;
        this.villa = villa;
        this.cantPersona = cantPersona;
        this.estado = estado;
        this.urbanizacion= urbanizacion;

    }
    //Metodo de Anadir Residente

     public Residente anadirResidente(Residente r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresando nombre:");String nombre = sc.nextLine();
        System.out.println("Ingrese cedula:");String cedula=sc.nextLine();
        System.out.println("Ingrese telefono:");String telefono = sc.nextLine();
        System.out.println("Ingrese email:");String email = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese la manzana:");int manzana = sc.nextInt();
        System.out.println("Ingrese la villa:");int villa = sc.nextInt();
        System.out.println("Ingrese la cantidad de Personas:");int cantPersona = sc.nextInt();
        System.out.println("Ingrese el estado:");Estado estado = Estado.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Ingrese la Urbanizacion:");String urbanizacion = sc.nextLine();

        r = new Residente(nombre,cedula,telefono,email,manzana,villa,cantPersona,estado,urbanizacion);
        //System.out.println("")
        return r;
    }

    //GETTERS AND SETTERS
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public int getManzana() {
        return manzana;
    }
    public void setManzana(int manzana) {
        this.manzana = manzana;
    }
    public int getVilla() {
        return villa;
    }
    public void setVilla(int villa) {
        this.villa = villa;
    }
    public int getCantPersona() {
        return cantPersona;
    }
    public void setCantPersona(int cantPersona) {
        this.cantPersona = cantPersona;
    }
    public String getUrbanizacion() {
        return urbanizacion;
    }
    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    //To String
    @Override
    public String toString() {
        return super.toString()+ "Manzana: "+manzana+"\nVilla: "+villa+"\nTelefono: "+cantPersona+"\nEstado: "+estado+"\nUrbanizacion:"+urbanizacion;
}
}
