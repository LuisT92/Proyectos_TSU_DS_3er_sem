package uia.dapp1.crud;

import javax.swing.*;
import java.sql.*;

public class delete {
    public static void main(String[] args) throws SQLException {
        Connection bs = null;
        String user = "root";
        String pass = "Mildred.19";
        String url = "jdbc:mysql://localhost:3306/ibero";
        try {
            bs = DriverManager.getConnection(url, user, pass);
            if (bs != null) {
                System.out.println("Conectado");
                String query5 = "DELETE FROM nuevo WHERE id=2";
                PreparedStatement pst5 = bs.prepareStatement(query5);
                pst5.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                String show = "SELECT * FROM nuevo";
                Statement st = bs.createStatement();
                ResultSet rs = st.executeQuery(show);
                while (rs.next()) {
                    System.out.println(rs.getInt(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                    System.out.println(rs.getInt(4));
                }
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
