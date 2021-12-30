package uia.dapp1.ejerciciopolimorfismo;

import java.util.Scanner;

public class entrenador extends seleccionFutbol{
    private int id_Federacion;

    public entrenador(int id, int edad, String nombre, String apellidos, int id_Federacion) {
        super(id, edad, nombre, apellidos);
        this.id_Federacion = id_Federacion;
    }

    public int getId_Federacion() {
        return id_Federacion;
    }

    public void setId_Federacion(int id_Federacion) {
        this.id_Federacion = id_Federacion;
    }

    public void planificarEntrenamiento(){
        int dia, mes, anio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la fecha de entrenamiento el dia, mes y anio en ese orden");
        dia=entrada.nextInt();
        mes=entrada.nextInt();
        anio=entrada.nextInt();
        System.out.println("El entrenamiento queda asignado para: "+dia+"/"+mes+"/"+anio);
    }
    @Override
    public void entrenamiento() {
        System.out.println("convoca al entrenamiento y supervisa");
        planificarEntrenamiento();
    }
}
