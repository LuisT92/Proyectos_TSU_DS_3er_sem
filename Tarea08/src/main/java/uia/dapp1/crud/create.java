package uia.dapp1.crud;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class create {
    public static void main(String[] args) throws SQLException {
        Connection bs = null;
        String user = "root";
        String pass = "Mildred.19";
        String url = "jdbc:mysql://localhost:3306/ibero";
        try {
            bs = DriverManager.getConnection(url, user, pass);
            if (bs != null) {
                System.out.println("Conectado");
                String query1 = "CREATE TABLE if not exists nuevo (\n" +
                        "  id INT AUTO_INCREMENT NOT NULL AUTO_INCREMENT,\n" +
                        "  nombre VARCHAR(45) NULL,\n" +
                        "  apellido VARCHAR(45) NULL,\n" +
                        "  edad INT NULL,\n" +
                        "  PRIMARY KEY (id)\n" +
                        ");";
                Statement st1 = bs.createStatement();
                int r1 = st1.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "Tabla creada");
            }
            else {
                System.out.println("No conectado");
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Cerrando conexion");
            if (bs != null) {
                bs.close();
                if (!bs.isClosed()) {
                    System.out.println("No se pudo cerrar la conexión");
                } else {
                    System.out.println("Conexión cerrada");
                }
            }
        }
    }
}
