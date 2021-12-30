package uia.dapp1.ejerciciocolecciones;

import java.util.*;

public class show {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Array> colores = null;
    static HashSet animals = null;
    static TreeMap<Integer, String> personas = null;
    public static void main(String[] args){
        colores = new ArrayList<>();
        animals = new HashSet<String>();
        personas = new TreeMap<Integer, String>();
        int opcion;
        do {
            System.out.println("Que desea construir?");
            System.out.println("1: Arraylist");
            System.out.println("2: HashSet");
            System.out.println("3: TreeMap");
            System.out.println("4: Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    addcolores();
                    break;
                case 2:
                    addAnimals();
                    break;
                case 3:
                    addPersonas();
                    break;
                case 4:
                    System.out.println("visualizar");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 4);
        for (Array muestra: colores) {
            System.out.println(muestra.getColores());
        }
        System.out.println(animals);
        System.out.println(personas);
    }
    public static void addcolores(){
        Array ingresa = new Array();
        int opc;
        do {
            System.out.println("1: ingresar color");
            System.out.println("2: Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa un color");
                    ingresa.setColores(entrada.next());
                    colores.add(ingresa);
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opc != 2);
    }
    public static void addAnimals(){
        int opc;
        do {
            System.out.println("1: ingresar animal");
            System.out.println("2: Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    Hash ingresa = new Hash();
                    System.out.println("Ingresa un animal");
                    ingresa.setAnimal(entrada.next());
                    animals.add(ingresa);
                    break;
                case 2:
                    System.out.println("Adios");
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opc != 2);
    }
    public static void addPersonas(){
        int opc;
        do {
            System.out.println("1: ingresar animal");
            System.out.println("2: Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    Tree ingresa = new Tree();
                    System.out.println("Ingresa el nombre de la persona");
                    ingresa.setPersona(entrada.next());
                    System.out.println("Ingresa la edad de " + ingresa.getPersona());
                    ingresa.setEdad(entrada.nextInt());
                    personas.put(ingresa.getEdad(), ingresa.getPersona());
                    break;
                case 2:
                    System.out.println("Adios");
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opc != 2);
    }
}
