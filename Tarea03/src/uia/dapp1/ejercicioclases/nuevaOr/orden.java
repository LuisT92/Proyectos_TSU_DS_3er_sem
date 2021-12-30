package uia.dapp1.ejercicioclases.nuevaOr;

import java.util.ArrayList;

public class orden extends producto{
    private int idOrden;
    private ArrayList Productos = new ArrayList();
    public orden(int idProducto, String nombre, int idOrden) {
        super(idProducto, nombre);
        this.idOrden = idOrden;
    }
    public static void orden(){
    }
    public static boolean agregarProducto(){
        return true;
    }
    public void calcularTotal(){}
    public void mostrarOrden(){}
}
