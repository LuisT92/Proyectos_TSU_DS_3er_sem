package uia.dapp1.ejerciciopolimorfismo;

import java.util.Scanner;

public class futbolista extends seleccionFutbol{
        private int dorsal;
        private String demarcacion;

    public futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion) {
        super(id, edad, nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public static void entrevista () {
        int dia, mes, anio;
        String entrevistador;
        Scanner entrada = new Scanner(System.in);
            System.out.println("los jugadores tendra una entrevista general");
                    System.out.println("Ingresa el nombre del entrevistador");
                    entrevistador=entrada.next();
                    System.out.println("Ingresa el anio, el mes y el dia en ese orden para la entrevista");
                    dia=entrada.nextInt();
                    mes=entrada.nextInt();
                    anio=entrada.nextInt();
                    System.out.println("La entrevista se agenda para la fecha "+dia+"/"+mes+"/"+anio+" con el periodista: "+entrevistador);
    }

    @Override
    public void entrenamiento() {
        System.out.println("Convocado al entrenamiento");
    }
}
