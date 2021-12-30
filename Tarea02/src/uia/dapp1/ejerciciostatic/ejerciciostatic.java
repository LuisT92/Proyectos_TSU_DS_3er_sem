package uia.dapp1.ejerciciostatic;

public class ejerciciostatic {
    public static int multiplicacion(int a, int b){
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;
    }
    public int Multiplicacion(int c, int d){
        int multiplicacion;
        multiplicacion = c * d;
        return multiplicacion;
    }
    public static void main(String[]args){

        System.out.println("El resultado de la multiplicacion static es: "+ejerciciostatic.multiplicacion(5,2));

        ejerciciostatic mult = new ejerciciostatic();
        System.out.println("El resultado de la multiplicacion es: "+ mult.Multiplicacion(5,2));
        mult.Multiplicacion(5,2);
        //Ambas funciones retornan el mismo resultado y realizan la misma operacion
        //pero para poder ejectar una funcion que no es estatica hay que generar un objeto a partir de la clase
        //mientras que cuando es estatico se genera con solo llamar a la clase sin generar un objeto nuevo
    }
}
