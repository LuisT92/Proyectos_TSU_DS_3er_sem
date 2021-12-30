package uia.dapp1.pasoporvalor;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class  pasoporvalor {
    public static void mostrar(int a, int b){
        int suma;
        suma = a+b;
        System.out.println("La suma de los numeros ingresados es: "+ suma);
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int a, b;
        System.out.println("Ingresa el primer numero a sumar");
        a=entrada.nextInt();
        System.out.println("Ingresa el segundo numero a sumar");
        b=entrada.nextInt();
        mostrar(a,b);

    }
}
