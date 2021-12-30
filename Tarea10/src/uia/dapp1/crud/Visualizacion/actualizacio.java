package uia.dapp1.crud.Visualizacion;

import uia.dapp1.crud.conexion_bd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class actualizacio {
    protected JPanel actual;
    private JTextField nombre;
    private JTextField edad;
    private JButton salirButton;
    private JButton modificarButton;

    public actualizacio() {
        Connection conexion = conexion_bd.coneccion();
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre_mod = nombre.getText();
                    int edad_mod = Integer.parseInt(edad.getText());
                    String act = "UPDATE nuevo SET edad = " + edad_mod + " WHERE nombre = '" + nombre_mod + "'";
                    PreparedStatement pst = conexion.prepareStatement(act);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Actualizado");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Formulario.frame.setVisible(true);
                Formulario.actualiza.setVisible(false);
            }
        });
    }
}
