package uia.dapp1.ejercicioherencia;

import java.util.Scanner;

public class Estudiante extends Persona{
    private int grado;
    private char grupo;

    public Estudiante(String nombre, String domicilio, String horario, int grado, char grupo) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public char getGrupo() {
        return grupo;
    }
    public void estudiar(){
        Scanner entrada = new Scanner(System.in);
        boolean regular;
        int opc;
        do {
        System.out.println("El alumno es regular?");
        System.out.println("1-. Si");
        System.out.println("2-. No");
        System.out.println("3-. Salir");
        opc = entrada.nextInt();

           switch(opc){
               case 1:
                   System.out.println("El alumno es regular");
                   regular = true;
                   break;
               case 2:
                   regular = false;
                   System.out.println("Cuantas materias adeuda?");
                   int reprobadas = entrada.nextInt();
                   if (reprobadas == 0){
                       System.out.println("Es un alumno regular");
                       regular = true;
                   }
                   if(reprobadas <= 2 && reprobadas > 0){
                       System.out.println("Puede continuar");
                   }
                   else if(reprobadas >=3) {
                       System.out.println("El alumno no puede continuar");
                       System.out.println("Aplica baja");
                   }
               case 3:
                   System.out.println("Gracias");
                   break;
               default:
                   System.out.println("Seleccion incorrecta");
                   break;
           }
       } while(opc != 3);
    }
}
