package uia.dapp1.ejercicioinstanceof;

import java.util.Scanner;

public class rectangulo extends figuraGeometrica{
    public rectangulo(float lado, float base) {
        super(lado, base);
    }

    @Override
    public void area(float a, float b) {
        float area = a*b;
        System.out.println("El area del rectangulo es:"+ area);
    }

    @Override
    public void perimetro(float a, float b) {
        float perimetro = 2*(a+b);
        System.out.println("El perimetro del rectangulo es: "+ perimetro);
    }
}
