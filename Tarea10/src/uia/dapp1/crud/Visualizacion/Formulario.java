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

public class Formulario {
    private JPanel formulario;
    private JTable tabla;
    private JButton buscar;
    private JButton agregar;
    private JButton eliminar;
    private JButton actualizar;
    private JButton salir;
    private JButton modificar;
    static JFrame frame = new JFrame("Formulario");
    static JFrame buscar_seccion = new JFrame("Buscar");
    static JFrame agrega = new JFrame("Agregar");
    static JFrame elimina = new JFrame("Eliminar");
    static JFrame actualiza = new JFrame("Actualizar");

    Connection conexion = conexion_bd.coneccion();

    public Formulario() {

        tabla();

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscar_seccion.setContentPane(new buscar().search);
                buscar_seccion.pack();
                buscar_seccion.setVisible(true);
                frame.setVisible(false);
            }
        });
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agrega.setContentPane(new Insert().agrega);
                agrega.pack();
                agrega.setVisible(true);
                frame.setVisible(false);
            }
        });
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elimina.setContentPane(new Eliminar().elimina);
                elimina.pack();
                elimina.setVisible(true);
                frame.setVisible(false);
            }
        });
        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualiza.setContentPane(new actualizacio().actual);
                actualiza.pack();
                actualiza.setVisible(true);
                frame.setVisible(false);
            }
        });
        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabla();
            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexion_bd.cerrarConexion(conexion);
                System.exit(0);
            }
        });
    }

    public void tabla(){
        String sql = "SELECT * FROM nuevo";
        DefaultTableModel ver = (DefaultTableModel) tabla.getModel();
        tabla.setModel(ver);
        String[] datos = new String[6];
        ver.addColumn("Nombre");
        ver.addColumn("Apellido");
        ver.addColumn("Edad");
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(2);
                datos[1] = rs.getString(3);
                datos[2] = rs.getString(4);
                ver.addRow(datos);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        frame.setContentPane(new Formulario().formulario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
