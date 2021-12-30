package uia.dapp1.returnprimitivo;
import java.util.Scanner;

public class returnprimitivo {
    public static int a, b, suma;
    public static int a(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer numero a sumar");
        a=entrada.nextInt();
        a+=1;
        return a;
    }
    public static int b(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el segundo numero a sumar");
        b=entrada.nextInt();
        b+=1;
        return b;
    }
    public static int mostrar(int a, int b){
        int suma;
        suma = a + b;
        return suma;
    }
}
