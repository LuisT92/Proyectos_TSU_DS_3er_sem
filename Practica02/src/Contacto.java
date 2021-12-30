public class Contacto {
    protected String nombre, paterno, materno, tel_casa, celular, edad, mes_nac, dia_nac, anio_nac;
    //Atributos

    protected Contacto(String nombre, String paterno, String materno, String tel_casa, String celular, String edad, String mes_nac, String dia_nac, String anio_nac) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.tel_casa = tel_casa;
        this.celular = celular;
        this.edad = edad;
        this.mes_nac = mes_nac;
        this.dia_nac = dia_nac;
        this.anio_nac = anio_nac;
    }//Constructor

    public Contacto(){
        //Constructor vacio
    }

    //Getters and Setters de los atributos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getTel_casa() {
        return tel_casa;
    }

    public void setTel_casa(String tel_casa) {
        this.tel_casa = tel_casa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getMes_nac() {
        return mes_nac;
    }

    public void setMes_nac(String mes_nac) {
        this.mes_nac = mes_nac;
    }

    public String getDia_nac() {
        return dia_nac;
    }

    public void setDia_nac(String dia_nac) {
        this.dia_nac = dia_nac;
    }

    public String getAnio_nac() {
        return anio_nac;
    }

    public void setAnio_nac(String anio_nac) {
        this.anio_nac = anio_nac;
    }
}
