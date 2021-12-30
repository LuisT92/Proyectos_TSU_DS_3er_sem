package uia.dapp1.returnobjeto;


class mascota {
         private String nombre;
         public int edad;
         private String dueno;

         public class perro {
             void datos() {
                 nombre = "Milka";
                 edad = 2;
                 dueno = "Luis";
                 System.out.println("Los datos de la mascota son:");
                 System.out.println("Nombre: "+nombre);
                 System.out.println("Edad: "+edad);
                 System.out.println("Dueño: "+dueno);
             }
         }
         void mostrar(){
             perro uno = new perro();
             uno.datos();
         }
     }
public class returnobjeto {
    public static void main(String[] args){
         mascota uno = new mascota();
         uno.mostrar();
    }
}
