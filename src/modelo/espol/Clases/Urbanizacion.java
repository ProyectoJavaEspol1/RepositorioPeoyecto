package modelo.espol.Clases;
import modelo.espol.Personas.*;

import java.util.ArrayList;

public class Urbanizacion {
    private String nombre;
    private  String etapa;
    private String emailAdmin;
    private String direccion;
    private String constructora;
    private String colaborador;
    private ArrayList<Residente> residentes;


    //Constructoras
    public Urbanizacion(String nombre,String etapa,String emailAsdmin,String direccion,String constructora,Colaboradores colaborador){
        this.nombre= nombre;
        this.etapa= etapa;
        this.emailAdmin = emailAsdmin;
        this.direccion = direccion;
        this.constructora = constructora;
        this.colaborador = colaborador.getNombre();
    }
    //getters && setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEtapa() {
        return etapa;
    }
    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }
    public String getEmailAdmin() {
        return emailAdmin;
    }
    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getColaborador() {
        return colaborador;
    }
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
    public ArrayList<Residente> getResidentes() {
        return residentes;
    }
    public void setResidentes(ArrayList<Residente> residentes) {
        this.residentes = residentes;
    }
    //metodos

   public  String mostrarinformacion(){
       return "Urbanizacion"  + nombre + '\'' + ", etapa='" + etapa ;
   }

    @Override
    public String toString() {
        return "Nombre:"+nombre+"\nEtapa:"+etapa+"\nEmail:"+emailAdmin+"\nDireccion:"
                +direccion+"\nConstructora:"+constructora+"\nAdministrador:"+colaborador;
    }
}
