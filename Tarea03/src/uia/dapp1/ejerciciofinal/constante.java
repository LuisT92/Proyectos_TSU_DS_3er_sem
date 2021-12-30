package uia.dapp1.ejerciciofinal;

public class constante {
    private final int edad;//constante
    private int anios;

    public constante(int edad, int anios) {
        this.edad = edad;
        this.anios = anios;
    }
    public void show(){
        System.out.println("La edad es (constante): "+ edad);
        System.out.println("La edad es (modificable): "+ anios);
    }

    public void show1(){
        System.out.println("La edad es (constante): "+ edad);
        System.out.println("La edad es (modificable): "+ anios);
    }

    public int getEdad() {
        return edad;
    }

    public int getAnios() {
        return anios;
    }
    //al generar los getters y setters el sistema no genera el set de edad ya que no es posible modificarlo
    public void setAnios(int anios) {
        this.anios = anios;
    }

    //*public void setEdad(int edad) {
    //    this.edad = anios;
    //} si generamos el metodo set para una variable nos salta un error ue indica: Cannot assign a value to final variable
}
