package uia.dapp1.ejercicioexcepciones;

public class capturarDatos {
    private int edad;
    private String nombre;
    private float saldo;

    public capturarDatos(int edad, String nombre, float saldo) {
        this.edad = edad;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public capturarDatos() {
    }
}
