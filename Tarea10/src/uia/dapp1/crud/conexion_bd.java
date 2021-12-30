package uia.dapp1.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion_bd {
    public static Connection coneccion() {
    Connection bs = null;
    String user = "root";
    String pass = "Mildred.19";
    String url = "jdbc:mysql://localhost:3306/ibero";
    try{
        bs = DriverManager.getConnection(url,user,pass);
        if(bs != null) {
            System.out.println("Conexion exitosa");
        }
        else{
            System.out.println("Conexion fallida");
        }
        }
    catch (SQLException e) {
        System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        e.printStackTrace();
        }
    return bs;
    }
    public static void cerrarConexion(Connection bs) {
        try {
            if(bs != null) {
            bs.close();
            if(!bs.isClosed()){
                System.out.println("No es posible cerrar");
                }
            else{
                System.out.println("Conexion cerrada");
                }
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            e.printStackTrace();
        }
    }
   /*
   public static void main(String[] args) {
        conexion_bd.coneccion();
        conexion_bd.cerrarConexion(coneccion());
    }
    */
}