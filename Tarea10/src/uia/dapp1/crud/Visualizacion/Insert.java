package uia.dapp1.crud.Visualizacion;

import uia.dapp1.crud.conexion_bd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    protected JPanel agrega;
    private JTextField nombre;
    private JButton insertar;
    private JButton salirButton;
    private JTextField apellido;
    private JTextField edad;

    public Insert() {

        Connection conexion = conexion_bd.coneccion();

        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = Insert.this.nombre.getText();
                    String apellido = Insert.this.apellido.getText();
                    int edad_ag = Integer.parseInt(edad.getText());
                    String query = "insert into nuevo (nombre, apellido, edad) values (?,?,?)";
                    PreparedStatement pst = conexion.prepareStatement(query);

                    pst.setString(1,nombre);
                    pst.setString(2,apellido);
                    pst.setInt(3,edad_ag);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Insertado");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Formulario.frame.setVisible(true);
                Formulario.agrega.setVisible(false);
            }
        });
    }
}
