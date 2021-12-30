package uia.dapp1.ejerciciopolimorfismo;

import java.util.Scanner;

public class masajista extends seleccionFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public masajista(int id, int edad, String nombre, String apellidos, String titulacion, int aniosExperiencia) {
        super(id, edad, nombre, apellidos);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public static void darMasaje(){
        int  dia, mes, anio;
        String jugador_name, jugador_apellido;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Ingresa el nombre del jugador que requiere el masaje");
            jugador_name = entrada.next();
            System.out.println("Ingresa el nombre del jugador que requiere el masaje");
            jugador_apellido=entrada.next();
            System.out.println("Ingresa el dia, mes y anio en ese orden");
            dia=entrada.nextInt();
            mes=entrada.nextInt();
            anio=entrada.nextInt();
            System.out.println("El masaje se agendo con exito para la fecha: "+dia+"/"+mes+"/"+anio);
            System.out.println("para el jugador: "+jugador_name+" "+jugador_apellido);
        }

    @Override
    public void entrenamiento() {
        System.out.println("Pendiente del entrenamiento para dar atencion y prioridad a jugadores con molestias");
    }
}
