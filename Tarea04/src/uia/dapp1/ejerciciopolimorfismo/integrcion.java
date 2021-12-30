package uia.dapp1.ejerciciopolimorfismo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class integrcion {
    private static List<seleccionFutbol> mexico = null;
    public static Scanner entrada = new Scanner(System.in);

    public static void main (String[]args){
        int opcion, opcion1;
        mexico = new ArrayList<>();
        do {
            System.out.println("Que desea agregar?");
            System.out.println("1:Futbolista");
            System.out.println("2: Masajista");
            System.out.println("3: Entrenador");
            System.out.println("4: Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    agregarFutbolista();
                    break;
                case 2:
                    agregarmasajista();
                    break;
                case 3:
                    agregarentrenador();
                    break;
                case 4:
                    System.out.println("Seleccion lista");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 4);
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1: Concentrarse");
            System.out.println("2: Entrenar");
            System.out.println("3: Agendar entrevista");
            System.out.println("4: Agendar masajes");
            System.out.println("5: Viajar");
            System.out.println("6: Jugar un partido");
            System.out.println("7: Salir");
            opcion1 = entrada.nextInt();
            switch (opcion1) {
                case 1:
                    seleccionFutbol.concentrarse();
                    System.out.println("Las siguientes personas han sido convocadas a la seleccion");
                    for (seleccionFutbol seleccionado : mexico) {
                        System.out.println(seleccionado.getNombre() + "," + seleccionado.getApellidos());
                    }
                    break;
                case 2:
                    for (seleccionFutbol entrenar : mexico) {
                        System.out.println(entrenar.getNombre() + " " + entrenar.getApellidos() + " ");
                        entrenar.entrenamiento();
                    }
                    break;
                case 3:
                    futbolista.entrevista();
                    break;
                case 4:
                    masajista.darMasaje();
                    break;
                case 5:
                    seleccionFutbol.viajar();
                    System.out.println("Las siguientes personas deben preparse para viajar al destino:");
                    for (seleccionFutbol seleccionado : mexico) {
                        System.out.println(seleccionado.getNombre() + "," + seleccionado.getApellidos());
                    }
                    break;
                case 6:
                    seleccionFutbol.partidoFutbol();
                    System.out.println("Las siguientes personas han sido convocadas para el partido :");
                    for (seleccionFutbol seleccionado : mexico) {
                        System.out.println(seleccionado.getNombre() + "," + seleccionado.getApellidos());
                    }
                    break;
                case 7:
                    System.out.println("Todo listo, la seleccion esta completa.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion1!=7);
    }
    public static void agregarFutbolista(){
        futbolista nuevo = new futbolista(0,0,"","",0,"");
        System.out.println("Ingresa el nombre");
        nuevo.setNombre(entrada.next());
        System.out.println("Ingresa los apellidos");
        nuevo.setApellidos(entrada.next());
        System.out.println("Ingresa el dorsal");
        nuevo.setDorsal(entrada.nextInt());
        System.out.println("Ingresa la edad");
        nuevo.setEdad(entrada.nextInt());
        System.out.println("Ingresa la demarcacion");
        nuevo.setDemarcacion(entrada.next());
        System.out.println("Ingresa el ID");
        nuevo.setId(entrada.nextInt());
        mexico.add(nuevo);//aqui en cada uno de los casos agregamos a la lista que se crea a pertir de la clase
                            //padre a cada uno de los objetos que heredan de esta.
    }
    public static void agregarentrenador(){
        entrenador nuevo = new entrenador(0,1,"","",0);
        System.out.println("Ingresa el id de federacion");
        nuevo.setId_Federacion(entrada.nextInt());
        System.out.println("Ingresa el nombre");
        nuevo.setNombre(entrada.next());
        System.out.println("Ingresa los apellidos");
        nuevo.setApellidos(entrada.next());
        System.out.println("Ingresa el id del entrenador");
        nuevo.setId(entrada.nextInt());
        mexico.add(nuevo);
    }
    public static void agregarmasajista(){
        masajista nuevo = new masajista(0,0,"","","",0);
        System.out.println("Ingresa el id");
        nuevo.setId(entrada.nextInt());
        System.out.println("Ingresa la edad");
        nuevo.setEdad(entrada.nextInt());
        System.out.println("Ingresa el nombre");
        nuevo.setNombre(entrada.next());
        System.out.println("Ingresa los apellidos");
        nuevo.setApellidos(entrada.next());
        System.out.println("Ingresa los anios de experiencia");
        nuevo.setAniosExperiencia(entrada.nextInt());
        mexico.add(nuevo);
    }
}
