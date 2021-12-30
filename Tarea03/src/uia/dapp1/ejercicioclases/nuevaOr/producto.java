package uia.dapp1.ejercicioclases.nuevaOr;

public class producto {
    private int idProducto;
    private String nombre;

    public producto(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    private static void Producto(){

    }
    public static void Producto(String a, String b){

    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
