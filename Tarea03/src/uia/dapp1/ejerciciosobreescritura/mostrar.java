package uia.dapp1.ejerciciosobreescritura;

import java.util.Scanner;

public class mostrar {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            switch (opcion=menu()) {
                case 1:
                    Triangulo();
                    break;
                case 2:
                    Circulo();
                    break;
                case 3:
                    Cuadrado();
                    break;
                case 4:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Seleccion incorrecta");
                    break;
            }
        }while(opcion !=4);
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona una opcion");
        System.out.println("1:Triangulo");
        System.out.println("2:Circulo");
        System.out.println("3:Cuadrado");
        System.out.println("4: Salir");
        int opcion = entrada.nextInt();
        return opcion;
    }
    public static void Triangulo(){
        Scanner entrada = new Scanner(System.in);
        triangulo Triangulo = new triangulo(0,0);
        System.out.println("Ingresa el valor de la base");
        Triangulo.setA(entrada.nextFloat());
        System.out.println("Ingresa el valor de la altura");
        Triangulo.setB(entrada.nextFloat());
        Triangulo.area(Triangulo.getA(),Triangulo.getB());
        Triangulo.perimetro(Triangulo.getA(),Triangulo.getB());
    }
    public static void Circulo(){
        Scanner entrada = new Scanner(System.in);
        circulo Circulo = new circulo(0,0);
        System.out.println("Ingresa el valor del radio");
        Circulo.setB(entrada.nextFloat());
        Circulo.setA(3.1416f);
        Circulo.area(Circulo.getA(), Circulo.getB());
        Circulo.perimetro(Circulo.getA(), Circulo.getB());
    }
    public static void Cuadrado(){
        Scanner entrada = new Scanner(System.in);
        rectangulo rectangulo = new rectangulo(0,0);
        System.out.println("Ingresa el valor de la base");
        rectangulo.setA(entrada.nextFloat());
        System.out.println("Ingresa el valor de la altura");
        rectangulo.setB(entrada.nextFloat());
        rectangulo.area(rectangulo.getA(), rectangulo.getB());
        rectangulo.perimetro(rectangulo.getA(), rectangulo.getB());
    }
}