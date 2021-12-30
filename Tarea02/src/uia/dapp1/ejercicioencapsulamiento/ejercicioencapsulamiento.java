package uia.dapp1.ejercicioencapsulamiento;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ejercicioencapsulamiento {
        static class mascota{ //Todas la variables se declaran Private
        private int edad;           //podemos ocupar protected o public dependiendo de lo que se requiere
        private String nombre;      //Con public todas las clases pueden acceder
        private String dueno;       //con protected permite el acceso desde subclases y miembros del mismo paquete

        public void setedad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setDueno(String dueno){
            this.dueno = dueno;
        }
        public int getEdad(){
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDueno() {
            return dueno;
        }
        static class cita{ //inner clas
            private int dia;
            private int mes;
            private int anio;

            public int getDia() {return dia;}
            //Parta poder accesar a las variables private usamos gettter y setter public
            //Cuando encapsulamos private solo podemos usar estoas variables o atributos
            //desde la clase donde pertenecen o en su caso solo puedn ser usadas por los metodos de la misma
            //clase

            public void setDia(int dia) {
                this.dia = dia;
            }

            public int getMes() {
                return mes;
            }

            public void setMes(int mes) {
                this.mes = mes;
            }

            public int getAnio() {
                return anio;
            }

            public void setAnio(int anio) {
                this.anio = anio;
            }
        }

    }
}


