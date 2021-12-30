package uia.dapp1.ejercicioexcepciones;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class show {
    private static List<capturarDatos> data = null;
    private static List<capturarDatos> data_general = null;
    private static Scanner entrada = new Scanner(System.in);
    public static void main (String[]args){
        int opcion;
        data = new LinkedList<>();
        data_general = new LinkedList<>();
        do {
            System.out.println("deseas ingresar datos?");
            System.out.println("1: Si");
            System.out.println("2: No y visualizar datos");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    bankData();
                    break;
                case 2:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=2);
        System.out.println("Segmento premium: ");
        showData();
        System.out.println("Segmento general ");
        showData_general();
    }
    public static void bankData(){
        capturarDatos cliente = new capturarDatos();
        System.out.println("Ingresa el nombre");
        cliente.setNombre(entrada.next());
        System.out.println("Ingresa la edad de: "+cliente.getNombre());
        cliente.setEdad(entrada.nextInt());
        System.out.println("Ingresa el saldo de: " + cliente.getNombre());
        cliente.setSaldo(entrada.nextFloat());
        try {
            if(cliente.getSaldo()>100000){
                System.out.println("El cliente "+cliente.getNombre()+" pertenece al segmento premium");
                data.add(cliente);
            }
            else{
                throw new ExcepcionPremium("El cliente "+cliente.getNombre()+"No pertenece al segmento premium");
            }
        }catch(Exception e) {
            System.out.println("El cliente se envia a segmemnto general");
            data_general.add(cliente);
        }
    }
    public static void showData(){
        for (capturarDatos show: data) {
            System.out.println("Nombre: "+show.getNombre()+" edad: "+show.getEdad()+" Saldo: "+show.getSaldo());
        }
    }
    public static void showData_general(){
        for (capturarDatos show_general: data_general) {
            System.out.println("Nombre: "+show_general.getNombre()+" edad: "+show_general.getEdad()+" Saldo: "+show_general.getSaldo());
        }
    }
}
