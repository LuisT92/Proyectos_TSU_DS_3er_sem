package uia.dapp1.Archivo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lectorArchivos {
    private JPanel lector;
    private JTextField archivo;
    private JButton select;
    private JTextPane mostrar;
    private JButton clean;
    private JButton close;
    private JLabel label;

    public lectorArchivos() {
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser seleccion = new JFileChooser();
                seleccion.showOpenDialog(lector);
                archivo.setText(seleccion.getSelectedFile().getAbsolutePath());
                try {
                    FileReader leer = new FileReader(seleccion.getSelectedFile());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                BufferedReader lector = null;
                try {
                    lector = new BufferedReader(new FileReader(seleccion.getSelectedFile()));
                }
                catch (FileNotFoundException ex) {
                    mostrar.setText("No se encontro el archivo");
                }
                String linea;
                String texto = " ";
                try {
                    while ((linea = lector.readLine()) != null) {
                        texto += linea + "\n";
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                mostrar.setText(texto);
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar.setText("");
                archivo.setText("");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("lectorArchivos");
        frame.setContentPane(new lectorArchivos().lector);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    }