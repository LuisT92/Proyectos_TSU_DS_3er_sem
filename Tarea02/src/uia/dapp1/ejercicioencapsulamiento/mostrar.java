package uia.dapp1.ejercicioencapsulamiento;

import java.util.Scanner;

public class mostrar {

    public static void datos(){
        Scanner entrada = new Scanner(System.in);
        ejercicioencapsulamiento.mascota paciente1 = new ejercicioencapsulamiento.mascota();
        System.out.println("Ingresa el nombre de la mascota");
        paciente1.setNombre(entrada.next());
        System.out.println("Ingresa el nombre del dueño de la mascota " + paciente1.getNombre());
        paciente1.setDueno(entrada.next());
        System.out.println("Ingrese la edad de: " + paciente1.getNombre());
        paciente1.setedad(entrada.nextInt());
        System.out.println("Los datos ingresados son:");
        System.out.println("Nombre: " + paciente1.getNombre());
        System.out.println("Dueño: " + paciente1.getDueno());
        System.out.println("Edad: " + paciente1.getEdad());
    }
    public static int menuCita(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Desea agendar una cita?");
        System.out.println("1: si");
        System.out.println("2: no");
        opcion = entrada.nextInt();
        return opcion;
    }
    public static int  concretar(int opcion){
        if(opcion == 1){
            System.out.println("OK");
        }
        else if(opcion > 1){
            System.out.println("Gracias");
        }
        return opcion;
    }
    public static void cita(int opc){
        Scanner entrada = new Scanner(System.in);
        switch (opc) { //Usamos la inner class
            case 1:
                ejercicioencapsulamiento.mascota.cita nueva = new ejercicioencapsulamiento.mascota.cita();
                System.out.println("Digite el año");
                nueva.setAnio(entrada.nextInt());
                System.out.println("Digite el mes (numero)");
                nueva.setMes(entrada.nextInt());
                System.out.println("Digite el dia");
                nueva.setDia(entrada.nextInt());
                System.out.println("Su cita quedo agendada para el " + nueva.getDia() + "/" + nueva.getMes() + "/" + nueva.getAnio());
                break;
            case 2:
                System.out.println("Gracias por su registro");
                break;
            default:
                System.out.println("Adios");
                break;
        }
    }
    public static void main(String[] args) {
        datos();
        cita(concretar(menuCita()));
    }

}
