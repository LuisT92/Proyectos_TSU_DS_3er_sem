package uia.dapp1.ejerciciosobreescritura;

import uia.dapp1.ejercicioinstanceof.Circulo;

public class Elipse extends Circulo {
    public Elipse(float lado, float base) {
        super(lado, base);
    }
    public static void main(String[]args){
        Elipse a = new Elipse(1,2);
        System.out.println(a instanceof Circulo);
    }
}
