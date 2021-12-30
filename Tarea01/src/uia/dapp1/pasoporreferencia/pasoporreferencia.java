package uia.dapp1.pasoporreferencia;

import uia.dapp1.returnprimitivo.returnprimitivo;

public class pasoporreferencia {
    public static void main(String[] args){
        int x, y;
        x = returnprimitivo.a();
        y = returnprimitivo.b();
        returnprimitivo.suma = returnprimitivo.mostrar(x,y);
        System.out.println("La suma (se agrego +1 a los numeros ingresados) es: "+ returnprimitivo.suma);
    }
}
