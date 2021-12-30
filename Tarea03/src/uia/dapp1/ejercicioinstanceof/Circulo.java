package uia.dapp1.ejercicioinstanceof;

import uia.dapp1.ejerciciosobreescritura.Elipse;

public class Circulo extends figuraGeometrica{
    public Circulo(float lado, float base) {
        super(lado, base);
    }

    @Override
    public void area(float a, float b) {
        float area = a*(b*b);
        System.out.println("El area del rectangulo es:"+area);
    }

    @Override
    public void perimetro(float a, float b) {
        float perimetro = 2*(a*b);
        System.out.println("El area del rectangulo es:"+perimetro);
    }
    public static void main(String[]args){
        Circulo a = new Circulo(3.14f,2);
        System.out.println(a instanceof objeto);
    }
}
