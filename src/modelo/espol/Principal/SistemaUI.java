package modelo.espol.Principal;
import modelo.espol.Clases.*;
import modelo.espol.Personas.*;
import modelo.espol.Enums.*;
import java.util.*;
public class SistemaUI {
    private Scanner sc;
    private static ArrayList<Residente> residentes;
    private static ArrayList<Visitantes> visitantes;
    private static ArrayList<Colaboradores> colaboradores;
    private Urbanizacion urbanizacion;
    public SistemaUI(){
        sc = new Scanner(System.in);
    }

    public void presentarMenuPrincipal(){
        System.out.println("Bienvenido");
        System.out.println("1. Urbanizacion");
        System.out.println("2. Residentes");
        System.out.println("3. Visitantes");
        System.out.println("4. Colaboradores de la urbanizacion");
        System.out.println("5. Permisos de Entrada");
        System.out.println("6. Revision de Entrada");
        System.out.println("7. Reportes");
        System.out.println("8. Salir");
    }
    //Inicio del programa
    public void inicializarSistema(){
        residentes = new ArrayList<Residente>();
        visitantes = new ArrayList<Visitantes>();
        colaboradores = new ArrayList<Colaboradores>();
        Colaboradores cola1 = new Colaboradores("Kevin","0990054349","090056345","kevinjob@gmail.com",
                "Limpiador",TipoEmpleado.JARDINERO,Estado.ACTIVO,"2020-01-20","2020-02-20");
        Colaboradores cola2 = new Colaboradores("Maickel","0990554349","095056345","maickeljob@gmail.com",
                "Limpiador",TipoEmpleado.JARDINERO,Estado.ACTIVO,"2020-01-20","2020-02-20");
        urbanizacion = new Urbanizacion("Mucho Lote2", "Etapa4", cola2.getEmail(), "Narcisa de Jesus", "Gladys Solorzano", cola2);
        Residente residente1 = new Residente("Nicolas","0942309844","0956598461","nico2003@gmail.com",2937,12,4,Estado.ACTIVO,urbanizacion.getNombre());
        //Residente residente2 = new Residente("Pedro","0930984433","0956556461","pedro2003@gmail.com",2937,12,4,Estado.INACTIVO,urbanizacion.getNombre());
        colaboradores.add(cola1);
        colaboradores.add(cola2);
        residentes.add(residente1);
        //residentes.add(residente2);

    }

    public void iniciar(){
        String entrada ="";
        do{
            presentarMenuPrincipal();
            System.out.print("Ingrese una opcion:");entrada = sc.nextLine();
            if ("1".equals(entrada)) {
                System.out.println("\t|*****URBANIZACION*****|\t");
                System.out.println(urbanizacion.toString());
                System.out.print("Desea cambiar alguna informacion (Si/No):");
                String enter = sc.nextLine().toLowerCase();//-------------------------
                String seguir = "si";  //-------------------------
                while(seguir.equals("si")){
                if(enter.equals("si")){
                    System.out.print("Cual desea cambiar ej:Nombre,Etapa,gmail:");String cambiar = sc.nextLine();
                    cambiar = cambiar.toLowerCase();
                    if(cambiar.equals("nombre")){
                        System.out.print("Ingrese nuevo nombre:");
                        urbanizacion.setNombre(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }
                    else if (cambiar.equals("etapa")){
                        System.out.print("Ingrese la nueva Etapa:");
                        urbanizacion.setEtapa(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }
                    else if (cambiar.equals("email")){
                        System.out.print("Ingrese el nuevo Email:");
                        urbanizacion.setEmailAdmin(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }
                    else if (cambiar.equals("direccion")){
                        System.out.print("Ingrese la nueva Dirección:");
                        urbanizacion.setDireccion(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }
                    else if (cambiar.equals("constructora")){
                        System.out.print("Ingrese la nueva Constructora:");
                        urbanizacion.setConstructora(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }
                    else if(cambiar.equals("administrador")){
                        System.out.print("Ingrese el nuevo Administrador:");
                        urbanizacion.setColaborador(sc.nextLine());
                        System.out.println("----ACTUALIZADO----\n"+urbanizacion.toString());
                    }

                    System.out.print("DESEA SEGUIR MODIFICANDO LA INFORMACION(SI/NO):");seguir=sc.nextLine().toLowerCase();

                }
                else{
                    System.out.println("OK");
                    seguir="no";
                }

            }
            }
            //for(String cadena :lista) {
            //    System.out.println(cadena);
            else if (entrada.equals("2")){
                //for(Object r:residentes){
                //    System.out.println("Residente:"+residentes);
                //}
                //for(int i =0 ;i<residentes.size();i++){
               //     System.out.println("*****************************");
                //    System.out.println("Residente:"+(i+1)+"\n"+residentes.get(i));
               // }
                recorrer(residentes);
                boolean veri =true;
                while(veri){
                    mostrarsubmenu();
                    System.out.print("---->:"); String eleccion = sc.nextLine();
                    if(eleccion.equals("1")){
                        anadirResidente();
                        System.out.print("Desea agregar residente(Si/no):");

                    }
                }


            }
        }while(!entrada.equals("8"));
        System.out.println("\t\t☻☻☻ADIOS☻☻☻\t\t");
    }
    public void anadirResidente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresando nombre:");String nombre = sc.nextLine();
        System.out.print("Ingrese cedula:");String cedula=sc.nextLine();
        System.out.print("Ingrese telefono:");String telefono = sc.nextLine();
        System.out.print("Ingrese email:");String email = sc.nextLine();
        sc.nextLine();
        System.out.print("Ingrese la manzana:");int manzana = sc.nextInt();
        System.out.print("Ingrese la villa:");int villa = sc.nextInt();
        System.out.print("Ingrese la cantidad de Personas:");int cantPersona = sc.nextInt();
        //System.out.print("Ingrese el estado:");Estado estado = Estado.valueOf(sc.nextLine().toUpperCase());
        sc.nextLine();
        System.out.print("Ingrese la Urbanizacion:");String urbanizacion = sc.nextLine();

        Estado estado = null;
        Residente r= new Residente(nombre,cedula,telefono,email,manzana,villa,cantPersona,estado.ACTIVO,urbanizacion);
        residentes.add(r);
        //System.out.println("")return r;
    }
    public void mostrarsubmenu(){
        System.out.println("Bienvenido");
        System.out.println("1. Anadir Residente");
        System.out.println("2. Editar residente");
        System.out.println("3. Eliminar Residente");
    }
    public static void recorrer(ArrayList<Residente> r){
        for(int i =0 ;i<residentes.size();i++){
            System.out.println("*****************************");
            System.out.println("Residente:"+(i+1)+"\n"+residentes.get(i));
        }
        System.out.println("*****************************");
    }

}

