package uia.dapp1.registro;

public class alumno {
    protected String nombre, apellido_p, apellido_m, registro, carrera, grupo;

    public alumno(String nombre, String apellido_p, String apellido_m, String registro, String carrera, String grupo) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.registro = registro;
        this.carrera = carrera;
        this.grupo = grupo;
    }

    public alumno(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Alumno: "+ "\n" +
                "Nombre(s): " + nombre + "\n" +
                "Apellido Paterno: " + apellido_p + "\n" +
                "Apellido Materno: " + apellido_m + '\n' +
                "Registro: " + registro + '\n'+
                "Carrera: "  + carrera + '\n'
                + grupo + '\n';
    }
    public String getApellido_m() {
        return apellido_m;
    }
    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
