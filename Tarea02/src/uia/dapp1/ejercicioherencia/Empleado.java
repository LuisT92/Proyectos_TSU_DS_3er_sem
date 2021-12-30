package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class Empleado extends Persona{
    private String jefe;

    public Empleado(String nombre, String domicilio, String horario, String jefe) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }

    public String getJefe() {
        return jefe;
    }

    public float cobrar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cual va a ser el salario asignado?");
        float salario = entrada.nextFloat();
        System.out.println("El salario asignado es: "+ salario);
        return salario;
    }
    public void regimen(float a){
        Scanner entrada = new Scanner(System.in);
        double salarioNeto, retencionSS, ISR=0;
        int opc;
        do {
            System.out.println("Seleccione el regimen por el que se dara de alta:");
            System.out.println("1-. Asalariado");
            System.out.println("2-. Honorarios");
            System.out.println("3-. Salir");
            opc = entrada.nextInt();

               switch (opc) {
                   case 1:
                       retencionSS = a * .02775;
                       if (a >= 5156.65 && a <= 43767.36) {
                           ISR = (a * 0.0832) + 99.04;
                       } else if (a >= 43767.36) {
                           ISR = (a * 0.192) + 99.04;
                       }
                       salarioNeto = a - retencionSS - ISR;
                       System.out.println("El salario neto es: " + salarioNeto);
                       break;
                   case 2:
                       if (a >= 5156.65 && a <= 43767.36) {
                           ISR = (a * 0.0832) + 99.04;
                       } else if (a >= 43767.36) {
                           ISR = (a * 0.192) + 99.04;
                       }
                       salarioNeto = a - ISR;
                       System.out.println("El salario neto es: " + salarioNeto);
                       break;
                   case 3:
                       System.out.println("Gracias");
                       break;
                   default:
                       System.out.println("Seleccion incorrecta");
                       break;
               }
       }while(opc != 3);
       }
    }
