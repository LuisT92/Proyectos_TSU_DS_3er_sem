package uia.dapp1.ejercicioinstanceof;

public class Triangulo extends figuraGeometrica{
    public Triangulo(float lado, float base) {
        super(lado, base);
    }

    @Override
    public void area(float a, float b) {
        float area = (a*b)/2;
        System.out.println("El area del rectangulo es:"+area);
    }

    @Override
    public void perimetro(float a, float b) {
        float perimetro = a+(2*b);
        System.out.println("El area del rectangulo es:"+perimetro);
    }
}
