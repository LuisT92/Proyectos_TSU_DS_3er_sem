package uia.dapp1.crud.Visualizacion;

import uia.dapp1.crud.conexion_bd;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class buscar {
    protected JPanel search;
    private JTable table1;
    private JButton buscarButton;
    private JButton salirButton;
    private JTextField nombre;


    public buscar() {

        Connection conexion = conexion_bd.coneccion();

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nombre.getText();
                String sql = "SELECT * FROM nuevo WHERE nombre = '" + name + "'";
                DefaultTableModel busca = (DefaultTableModel) table1.getModel();
                busca.addColumn("Nombre");
                busca.addColumn("Apellido");
                busca.addColumn("Edad");
                table1.setModel(busca);
                String[] datos = new String[9];
                try {
                    Statement st = conexion.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {
                        datos[0] = rs.getString(2);
                        datos[1] = rs.getString(3);
                        datos[2] = rs.getString(4);
                        busca.addRow(datos);
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Formulario.frame.setVisible(true);
                Formulario.buscar_seccion.setVisible(false);
            }
        });
    }
}
