package uia.dapp1.ejerciciofinal;

public class muestra {
    public static void main(String[]args){
        constante prueba = new constante(20, 19);
        prueba.show();//muestra las edades
        prueba.setAnios(45);//modificamos la variabe
        //prueba.setEdad(40); si deseamos modificar la constante el error se muestra de nuevo
        prueba.show1();//mostramos de nuevo

    }
}
//cuando generamos una clase FINAL esta no permite heredar
//Cuando declaramos un metodo como FINAL esta ya no es posible modificarla con @Override
