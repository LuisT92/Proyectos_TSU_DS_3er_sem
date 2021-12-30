package uia.dapp1.ejerciciocolecciones;

public class Tree {
    String persona;
    int edad;

    public Tree(String persona, int edad) {
        this.persona = persona;
        this.edad = edad;
    }

    public Tree() {
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
