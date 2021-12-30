package uia.dapp1.ejercicioinstanceof;

public class figuraGeometrica extends objeto{
    final float pi = 3.14f;

    public figuraGeometrica(float lado, float base) {
        super(lado, base);
    }
    public float getPi() {
        return pi;
    }
    public void area(float a, float b){}
    public void perimetro(float a, float b){}
}
