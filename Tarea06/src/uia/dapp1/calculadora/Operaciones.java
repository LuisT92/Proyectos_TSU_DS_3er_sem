package uia.dapp1.calculadora;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Operaciones {
    public static double suma(double a, double b){
        double res;
        res = a + b;
        return res;
    }
    public static double resta(double a, double b){
        double res;
        res = a - b;
        return res;
    }
    public static double multiplicacion(double a, double b){
        double res;
        res = a * b;
        return res;
    }
    public static double division(double a, double b){
        double res;
        res = a / b;
        return res;
    }
}
