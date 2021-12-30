import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agenda {
    protected JPanel Agenda;
    private JTable Vista;
    private JButton Agregar;
    private JList lista;
    private JButton close;
    static JFrame frame = new JFrame("Agenda");
    static JFrame registro = new JFrame("Registro_contactos");
    public Agenda() {

        Agregar.addActionListener(new ActionListener() {//Abre el registro de contactos
            @Override
            public void actionPerformed(ActionEvent e) {
                registro.setContentPane(new Registrar().MainRegistro_contactos);
                registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                registro.pack();
                registro.setVisible(true);
                frame.setVisible(false);
                Vista.setModel(Registrar.table);//Agregar contactos a la tabla para mostrar
                lista.setModel(Registrar.list);//Agrega los contactos a la lista
            }
        });
        close.addActionListener(new ActionListener() {//Cierra el programa
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Vista.setModel(Registrar.table);//Agregar contactos a la tabla para mostrar
        lista.setModel(Registrar.list);//Agrega los contactos a la lista
    }
    public static void main(String[] args){//Metodo main
        try {
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
        frame.setContentPane(new Agenda().Agenda);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
