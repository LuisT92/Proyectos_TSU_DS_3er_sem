import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.*;

public class select {
    private JPanel select;
    private JTextField nombre;
    private JTable mostrar;
    private JButton buscar;
    private JButton limpiarButton;
    private JButton salirButton;



    public select()  {


        Connection con = conexion_bd.coneccion();
        String sql = "SELECT * FROM miembro";
        DefaultTableModel busca = (DefaultTableModel) mostrar.getModel();
        busca.addColumn("Nombre");
        busca.addColumn("Paterno");
        busca.addColumn("Materno");
        busca.addColumn("Fecha de nacimiento");
        busca.addColumn("Peso");
        busca.addColumn("email");
        mostrar.setModel(busca);
        String[] datos = new String[6];


            buscar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nombre.getText();
                    String sql = "SELECT * FROM miembro WHERE nombre = '" + name + "'";
                    DefaultTableModel busca = (DefaultTableModel) mostrar.getModel();
                    busca.addColumn("Nombre");
                    busca.addColumn("Paterno");
                    busca.addColumn("Materno");
                    busca.addColumn("Fecha de nacimiento");
                    busca.addColumn("Peso");
                    busca.addColumn("email");
                    mostrar.setModel(busca);
                    String[] datos = new String[6];
                    try {
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(sql);
                        while (rs.next()) {
                            datos[0] = rs.getString(2);
                            datos[1] = rs.getString(3);
                            datos[2] = rs.getString(4);
                            datos[3] = rs.getString(5);
                            datos[4] = rs.getString(6);
                            datos[5] = rs.getString(7);
                            busca.addRow(datos);
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            });
            limpiarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nombre.setText("");
                }
            });
            salirButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    conexion_bd.cerrarConexion(con);
                    System.exit(0);
                }
            });
        }
        public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Select");
        frame.setContentPane(new select().select);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
