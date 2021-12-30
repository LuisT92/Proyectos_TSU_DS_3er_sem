package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class Profesor extends Empleado{
    private char carrera;

    public Profesor(String nombre, String domicilio, String horario, String jefe, char carrera) {
        super(nombre, domicilio, horario, jefe);
        this.carrera = carrera;
    }

    public char getCarrera() {
        return carrera;
    }

    public void enseñar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Asignar Grupo");
        String grupo = entrada.next();
        System.out.println("Se asigno el grupo: "+ grupo);
    }
}
