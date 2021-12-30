import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registrar {
    protected JPanel MainRegistro_contactos;
    private JTextField Nombre;
    private JTextField Paterno;
    private JTextField Materno;
    private JTextField Edad;
    private JTextField Tel_fijo;
    private JTextField Celular;
    private JTextField Mes;
    private JTextField Dia;
    private JTextField Anio;
    private JButton cancelar;
    private JButton registrar;
    private JProgressBar barra;
    private JLabel Progreso;
    private JButton cerrar;
    static ArrayList<Contacto> contacts = new ArrayList<Contacto>();
    static DefaultListModel list = new DefaultListModel();
    static DefaultTableModel table = new DefaultTableModel();


    public Registrar() {

        Contacto nuevo = new Contacto();
        Nombre.addActionListener(new ActionListener() {//Nombre
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setNombre(Nombre.getText());
            }
        });
        Paterno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//Apellido Paterno
                nuevo.setPaterno(Paterno.getText());
            }
        });
        Materno.addActionListener(new ActionListener() {//Apellido Materno
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setMaterno(Materno.getText());
            }
        });
        Edad.addActionListener(new ActionListener() {//Edad
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setEdad(Edad.getText());
            }
        });
        Tel_fijo.addActionListener(new ActionListener() {//Telefono Fijo
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setTel_casa(Tel_fijo.getText());
            }
        });
        Celular.addActionListener(new ActionListener() {//Telefono Celular
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setCelular(Celular.getText());
            }
        });
        Mes.addActionListener(new ActionListener() {//Mes de Nacimiento
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setMes_nac(Mes.getText());
            }
        });
        Dia.addActionListener(new ActionListener() {//Dia de Nacimiento
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setDia_nac(Dia.getText());
            }
        });
        Anio.addActionListener(new ActionListener() {//Año de Nacimiento
            @Override
            public void actionPerformed(ActionEvent e) {
                nuevo.setAnio_nac(Anio.getText());
            }
        });
        cancelar.addActionListener(new ActionListener() {//Botón Cancelar, limpia los campos
            @Override
            public void actionPerformed(ActionEvent e) {
                Nombre.setText(" ");
                Paterno.setText(" ");
                Materno.setText(" ");
                Edad.setText(" ");
                Tel_fijo.setText(" ");
                Celular.setText(" ");
                Mes.setText(" ");
                Dia.setText(" ");
                Anio.setText(" ");
            }
        });
        registrar.addActionListener(new ActionListener() {//Botón Registrar, agrega el contacto a la lista y limpia los campos
            @Override
            public void actionPerformed(ActionEvent e) {
                contacts.add(nuevo);
                list.addElement(nuevo.getNombre() + " " + nuevo.getPaterno() + " " + nuevo.getMaterno());
                table.addRow(new Object[]{nuevo.getNombre(), nuevo.getPaterno(), nuevo.getMaterno(), nuevo.getEdad(), nuevo.getTel_casa(), nuevo.getCelular(), nuevo.getMes_nac(), nuevo.getDia_nac(), nuevo.getAnio_nac()});
                Nombre.setText(" ");
                Paterno.setText(" ");
                Materno.setText(" ");
                Edad.setText(" ");
                Tel_fijo.setText(" ");
                Celular.setText(" ");
                Mes.setText(" ");
                Dia.setText(" ");
                Anio.setText(" ");
            }
        });
        cerrar.addActionListener(new ActionListener() {//Botón Cerrar, cierra Registro y abre la Agenda
            @Override
            public void actionPerformed(ActionEvent e) {
                Agenda.frame.setVisible(true);
                Agenda.registro.setVisible(false);
            }
        });
    }
    public static void main(String[] args){//Main, no se si es necesario
        try {//Look and Feel
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }
}
