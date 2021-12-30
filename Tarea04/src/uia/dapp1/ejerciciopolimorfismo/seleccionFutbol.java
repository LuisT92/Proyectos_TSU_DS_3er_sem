package uia.dapp1.ejerciciopolimorfismo;

import java.util.Scanner;

public abstract class seleccionFutbol {
    protected int id, edad;
    protected String nombre, apellidos;

    public seleccionFutbol(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static void viajar(){
        String destino;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el destino");
        destino=entrada.next();
        System.out.println("El viaje quedara programado con destino a: "+destino);
    }
    public static void concentrarse(){
        int dia, mes, anio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la fecha de concentracion, el dia, mes y anio en ese orden");
        dia=entrada.nextInt();
        mes=entrada.nextInt();
        anio=entrada.nextInt();
        System.out.println("la concentracion queda agendada para: "+dia+"/"+mes+"/"+anio);
    }
    public abstract void entrenamiento();

    public static void partidoFutbol(){
        int fecha;
        String rival;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa la fecha del partido");
        fecha=entrada.nextInt();
        System.out.println("Ingresa el nombre del rival");
        rival=entrada.next();
        System.out.println("El partido se llevara a cabo el dia: "+fecha+" En contra del equipo: "+rival);
    }
}
