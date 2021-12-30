package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class Administrador extends Empleado{
     String puesto;

    public Administrador(String nombre, String domicilio, String horario, String jefe, String puesto) {
        super(nombre, domicilio, horario, jefe);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }
    public static String administrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Asignar puesto y carrera");
        String carrera = entrada.next();
        System.out.println("Se asigno a administrar la carrera: "+ carrera);
        return carrera;
    }
}
