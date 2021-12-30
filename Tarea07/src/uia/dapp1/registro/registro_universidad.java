package uia.dapp1.registro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.util.ArrayList;

public class registro_universidad {
    private JButton registrar;
    private JPanel panel1;
    private JTextPane mostrar;
    private JButton close;
    private JCheckBox economia;
    private JCheckBox software;
    private JComboBox gruposEconomia;
    private JComboBox gruposSoftware;
    private JTextField nombre;
    private JTextField ap;
    private JTextField am;
    private JTextField registro;
    private JButton generar;
    alumno nuevo_alumno = new alumno();

    public registro_universidad() {
        //Solo se generan 2 carreras pero es posible agregar mas
        gruposSoftware.setEnabled(false);//desactivar el combobox de grupos al iniciar programa
        gruposEconomia.setEnabled(false);
        String grupoS[] = {"Selecciona grupo","Grupo 1", "Grupo 2", "Grupo 3", "Grupo 4"};//grupos de software
        gruposEconomia.setModel(new DefaultComboBoxModel(grupoS));
        String grupoE[] = {"Selecciona grupo","Grupo A", "Grupo B", "Grupo C", "Grupo D"};//grupos de economia
        gruposSoftware.setModel(new DefaultComboBoxModel(grupoE));//cargar los grupos en el combobox

        registrar.addActionListener(new ActionListener() {//boton registrar
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!software.isSelected() && !economia.isSelected()) {//si no se selecciono ninguna carrera
                    JOptionPane.showMessageDialog(null, "No se ha selesccionado carrera y grupo");//Mensaje
                } else {//si se selecciono alguna carrera
                    nuevo_alumno.setNombre(nombre.getText());//se guarda el nombre
                    nuevo_alumno.setApellido_p(ap.getText());//se guarda el apellido paterno
                    nuevo_alumno.setApellido_m(am.getText());//se guarda el apellido materno
                    nuevo_alumno.setRegistro(registro.getText());//se guarda el registro
                    if(nombre.getText().equals("") || ap.getText().equals("") || am.getText().equals("") || registro.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "No se ha llenado todos los campos");//Mensaje
                    }//si no se llenaron todos los campos
                    else {//si se llenaron todos los campos
                        if (software.isSelected()) {//si se selecciono la carrera de software
                            nuevo_alumno.setGrupo(gruposSoftware.getSelectedItem().toString());//se guarda el grupo
                            nuevo_alumno.setCarrera("Software");//se guarda la carrera
                        }
                        if (economia.isSelected()) {//si se selecciono la carrera de economia
                            nuevo_alumno.setGrupo(gruposEconomia.getSelectedItem().toString());
                            nuevo_alumno.setCarrera("Economia");
                        }
                        mostrar.setText(mostrar.getText() + "\n" + nuevo_alumno.toString());//Se muestran los datos en el JTextPane
                    }
                }
            }
        });
        generar.addActionListener(new ActionListener() {//boton generar
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mostrar.getText().equals("")){//si no se ha registrado ningun alumno
                    JOptionPane.showMessageDialog(null, "No es posible generar archivo");
                    JOptionPane.showMessageDialog(null, "Favor de llenar todos los campos");//Mensajes
                }
                else {//Si se llenaron todos los campos y se mostraron los datos en el JTextPane se genera el archivo
                    PrintWriter archivo = null;
                    String fileName = JOptionPane.showInputDialog(panel1, "Nombre del archivo");//Se pide el nombre del archivo
                    try {
                        archivo = new PrintWriter(fileName + ".txt", "UTF-8");
                        archivo.println("Nombre: " + nuevo_alumno.getNombre() + " " + nuevo_alumno.getApellido_p() + " " + nuevo_alumno.getApellido_m());
                        archivo.println("Registro: " + nuevo_alumno.getRegistro());
                        archivo.println(nuevo_alumno.getGrupo());
                        archivo.close();
                        JOptionPane.showMessageDialog(null, "Se ha guardado el archivo");
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//boton cerrar
                System.exit(0);
            }
        });
        software.addActionListener(new ActionListener() {//boton software
            @Override
            public void actionPerformed(ActionEvent e) {
                if (software.isSelected()) {//si se selecciono la carrera de software
                    gruposSoftware.setEnabled(true);//se habilita el comboBox de grupos software
                    economia.setEnabled(false);//se deshabilita el boton de carrera de economia
                } else {//si se deselecciono la carrera de software
                    gruposSoftware.setEnabled(false);//se deshabilita el comboBox de grupos software
                    economia.setEnabled(true);//se habilita el boton de carrera de economia
                }
            }
        });
        economia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (economia.isSelected()) {
                    gruposEconomia.setEnabled(true);
                    software.setEnabled(false);
                } else {
                    gruposEconomia.setEnabled(false);
                    software.setEnabled(true);
                }
            }
        });
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("registro_universidad");
        frame.setContentPane(new registro_universidad().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
