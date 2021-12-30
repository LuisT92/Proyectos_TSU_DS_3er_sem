package uia.dapp1.ejerciciosobreescritura;

public class rectangulo extends triangulo{
    public rectangulo(int a, int b) {
        super(a, b);
    }

    @Override
    public void area(float a, float b) {
        float area = a*b;
        System.out.println("El area del cuadrado es: "+area);
    }

    @Override
    public void perimetro(float a, float b) {
        float perimetro = 2*(a+b);
        System.out.println("El area del cuadrado es: "+perimetro);
    }
}
