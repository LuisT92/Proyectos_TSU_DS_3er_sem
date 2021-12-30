package uia.dapp1.ejerciciosobreescritura;

public class circulo extends triangulo {
    public circulo(float a, float b) {
        super(a, b);
    }

    @Override
    public void area(float a, float b) {
        float area = a * (b*b);
        System.out.println("El area del circulo es: "+area);
    }

    @Override
    public void perimetro(float a, float b) {
        float perimetro =2*(a*b);
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}

