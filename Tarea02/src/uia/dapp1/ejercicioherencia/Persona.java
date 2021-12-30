package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class Persona {

    String nombre, domicilio, horario;//protected para que los que heredan pueden ingresar

    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public static void asistir(){
        Scanner entrada = new Scanner(System.in);
        boolean Asistencia;
        int opc;
        do{
            System.out.println("Que deseas registrar?:");
            System.out.println("1-. Asistencia");
            System.out.println("2-. Falta");
            opc = entrada.nextInt();

                switch(opc){
                    case 1:
                        Asistencia = true;
                        System.out.println("Asistencia Registrada");
                        break;
                    case 2:
                        Asistencia = false;
                        System.out.println("Falta Registrada");
                        break;
                    default:
                        System.out.println("Seleccion incorrecta");
                        break;

            }
        }while(opc>=3);
    }
}
