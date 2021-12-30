package uia.dapp1.ejerciciosobreescritura;

public class triangulo{
    float a, b;

    public triangulo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void area(float a, float b){
        float area;
        area = (a*b)/2;
        System.out.println("El area del Triangulo es: "+area);
    }
    public void perimetro(float a, float b){
        float perimetro = a+(2*b);
        System.out.println("El perimetro del Triangulo es: "+perimetro);
    }
}
