package uia.dapp1.crud.Visualizacion;

import uia.dapp1.crud.conexion_bd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eliminar {
    protected JPanel elimina;
    private JTextField nombre;
    private JButton salir;
    private JButton eliminar;

    Connection conexion = conexion_bd.coneccion();

    public Eliminar() {
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nom_eliminar = nombre.getText();
                    String eliminar_nom = "DELETE FROM nuevo WHERE nombre = '" + nom_eliminar + "'";
                    PreparedStatement pst = conexion.prepareStatement(eliminar_nom);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Formulario.frame.setVisible(true);
                Formulario.elimina.setVisible(false);
            }
        });
    }
}
