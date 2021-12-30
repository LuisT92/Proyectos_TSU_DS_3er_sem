package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Quien se va a registrar?");
            System.out.println("1-. Administrador");
            System.out.println("2-. Profesor");
            System.out.println("3-. Empleado");
            System.out.println("4-. Estudiante");
            System.out.println("5-. Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    Administrador xsd = new Administrador("", "", "","", "");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Seleccion incorrecta");
                    break;
            }
        }while(opc != 5);
    }
}
