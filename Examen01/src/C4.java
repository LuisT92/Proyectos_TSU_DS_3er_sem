import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C4 {
    private JPanel tablero;
    private JButton A2;
    private JButton A1;
    private JButton A3;
    private JButton A4;
    private JButton B1;
    private JButton D2;
    private JButton C2;
    private JButton C1;
    private JButton D1;
    private JButton B2;
    private JButton B3;
    private JButton C3;
    private JButton D3;
    private JButton B4;
    private JButton C4;
    private JButton D4;
    private JButton D5;
    private JButton D6;
    private JButton A5;
    private JButton B5;
    private JButton C5;
    private JButton A6;
    private JButton B6;
    private JButton C6;
    private JTextField J1;
    private JTextField J2;
    private JButton iniciar;
    private JButton salir;
    private JButton E1;
    private JButton E2;
    private JButton E3;
    private JButton E4;
    private JButton E5;
    private JButton E6;
    int turno = 1;

    public C4() {
        previo();
        A1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A1.setBackground(Color.red);
                    A1.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A1.setBackground(Color.blue);
                    A1.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        A2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A2.setBackground(Color.red);
                    A2.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A2.setBackground(Color.blue);
                    A2.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        A3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A3.setBackground(Color.red);
                    A3.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A3.setBackground(Color.blue);
                    A3.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        A4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A4.setBackground(Color.red);
                    A4.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A4.setBackground(Color.blue);
                    A4.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        A5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A5.setBackground(Color.red);
                    A5.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A5.setBackground(Color.blue);
                    A5.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        A6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    A6.setBackground(Color.red);
                    A6.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    A6.setBackground(Color.blue);
                    A6.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B1.setBackground(Color.red);
                    B1.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B1.setBackground(Color.blue);
                    B1.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B2.setBackground(Color.red);
                    B2.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B2.setBackground(Color.blue);
                    B2.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B3.setBackground(Color.red);
                    B3.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B3.setBackground(Color.blue);
                    B3.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B4.setBackground(Color.red);
                    B4.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B4.setBackground(Color.blue);
                    B4.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B5.setBackground(Color.red);
                    B5.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B5.setBackground(Color.blue);
                    B5.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        B6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    B6.setBackground(Color.red);
                    B6.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    B6.setBackground(Color.blue);
                    B6.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C1.setBackground(Color.red);
                    C1.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C1.setBackground(Color.blue);
                    C1.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C2.setBackground(Color.red);
                    C2.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C2.setBackground(Color.blue);
                    C2.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C3.setBackground(Color.red);
                    C3.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C3.setBackground(Color.blue);
                    C3.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C4.setBackground(Color.red);
                    C4.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C4.setBackground(Color.blue);
                    C4.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C5.setBackground(Color.red);
                    C5.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C5.setBackground(Color.blue);
                    C5.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        C6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    C6.setBackground(Color.red);
                    C6.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    C6.setBackground(Color.blue);
                    C6.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D1.setBackground(Color.red);
                    D1.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D1.setBackground(Color.blue);
                    D1.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D2.setBackground(Color.red);
                    D2.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D2.setBackground(Color.blue);
                    D2.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D3.setBackground(Color.red);
                    D3.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D3.setBackground(Color.blue);
                    D3.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D4.setBackground(Color.red);
                    D4.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D4.setBackground(Color.blue);
                    D4.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D5.setBackground(Color.red);
                    D5.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D5.setBackground(Color.blue);
                    D5.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        D6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    D6.setBackground(Color.red);
                    D6.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    D6.setBackground(Color.blue);
                    D6.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E1.setBackground(Color.red);
                    E1.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E1.setBackground(Color.blue);
                    E1.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E2.setBackground(Color.red);
                    E2.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E2.setBackground(Color.blue);
                    E2.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E3.setBackground(Color.red);
                    E3.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E3.setBackground(Color.blue);
                    E3.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E4.setBackground(Color.red);
                    E4.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E4.setBackground(Color.blue);
                    E4.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E5.setBackground(Color.red);
                    E5.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E5.setBackground(Color.blue);
                    E5.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        E6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(turno == 1) {
                    E6.setBackground(Color.red);
                    E6.setEnabled(false);
                    turno = -1;
                    mensaje(turno);
                    gana();
                }
                else if(turno == -1) {
                    E6.setBackground(Color.blue);
                    E6.setEnabled(false);
                    turno = 1;
                    mensaje(turno);
                    gana();
                }
            }
        });
        iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog("Ingresa nombre Jugador");
                J1.setText(nombre);
                String nombre2 = JOptionPane.showInputDialog("Ingresa nombre Jugador");
                J2.setText(nombre2);
                iniciar.setEnabled(false);
                iniciar.setVisible(false);
                ver();
                JOptionPane.showMessageDialog(null,"Turno de: "+J1.getText());
            }

        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public void gana(){
        if ((A1.getBackground()== Color.red && A2.getBackground()== Color.red && A3.getBackground()== Color.red && A4.getBackground() == Color.red)
        || (B1.getBackground()== Color.red && B2.getBackground()== Color.red && B3.getBackground()== Color.red && B4.getBackground() == Color.red)
        || (C1.getBackground()== Color.red && C2.getBackground()== Color.red && C3.getBackground()== Color.red && C4.getBackground() == Color.red)
        || (D1.getBackground()== Color.red && D2.getBackground()== Color.red && D3.getBackground()== Color.red && D4.getBackground() == Color.red)
        || (E1.getBackground()== Color.red && E2.getBackground()== Color.red && E3.getBackground()== Color.red && E4.getBackground() == Color.red)
        || (A1.getBackground()== Color.red && B1.getBackground()== Color.red && C1.getBackground()== Color.red && D1.getBackground() == Color.red)
        || (A2.getBackground()== Color.red && B2.getBackground()== Color.red && C2.getBackground()== Color.red && D2.getBackground() == Color.red)
        || (A3.getBackground()== Color.red && B3.getBackground()== Color.red && C3.getBackground()== Color.red && D3.getBackground() == Color.red)
        || (A4.getBackground()== Color.red && B4.getBackground()== Color.red && C4.getBackground()== Color.red && D4.getBackground() == Color.red)
        || (A5.getBackground()== Color.red && B5.getBackground()== Color.red && C5.getBackground()== Color.red && D5.getBackground() == Color.red)
        || (A6.getBackground()== Color.red && B6.getBackground()== Color.red && C6.getBackground()== Color.red && D6.getBackground() == Color.red)
        || (A6.getBackground()== Color.red && A5.getBackground()== Color.red && A4.getBackground()== Color.red && A3.getBackground() == Color.red)
        || (A5.getBackground() == Color.red && A4.getBackground() == Color.red && A3.getBackground() == Color.red && A2.getBackground() == Color.red)
        || (A4.getBackground() == Color.red && A3.getBackground() == Color.red && A2.getBackground() == Color.red && A1.getBackground() == Color.red)
        || (B6.getBackground()== Color.red && B5.getBackground()== Color.red && B4.getBackground()== Color.red && B3.getBackground() == Color.red)
        || (C6.getBackground()== Color.red && C5.getBackground()== Color.red && C4.getBackground()== Color.red && C3.getBackground() == Color.red)
        || (D6.getBackground()== Color.red && D5.getBackground()== Color.red && D4.getBackground()== Color.red && D3.getBackground() == Color.red)
        || (E6.getBackground()== Color.red && E5.getBackground()== Color.red && E4.getBackground()== Color.red && E3.getBackground() == Color.red)
        || (A1.getBackground()== Color.red && B2.getBackground()== Color.red && C3.getBackground()== Color.red && D4.getBackground() == Color.red)
        || (A2.getBackground()== Color.red && B3.getBackground()== Color.red && C4.getBackground()== Color.red && D5.getBackground() == Color.red)
        || (A3.getBackground()== Color.red && B4.getBackground()== Color.red && C5.getBackground()== Color.red && D6.getBackground() == Color.red)
        || (A4.getBackground()== Color.red && B3.getBackground()== Color.red && C2.getBackground()== Color.red && D1.getBackground() == Color.red)
        || (A5.getBackground()== Color.red && B4.getBackground()== Color.red && C3.getBackground()== Color.red && D2.getBackground() == Color.red)
        || (A6.getBackground()== Color.red && B5.getBackground()== Color.red && C4.getBackground()== Color.red && D3.getBackground() == Color.red)
        || (E1.getBackground()== Color.red && D1.getBackground()==Color.red && C1.getBackground()== Color.red && B1.getBackground() == Color.red)
        || (E2.getBackground()== Color.red && D2.getBackground()==Color.red && C2.getBackground()== Color.red && B2.getBackground() == Color.red)
        || (E3.getBackground()== Color.red && D3.getBackground()==Color.red && C3.getBackground()== Color.red && B3.getBackground() == Color.red)
        || (E4.getBackground()== Color.red && D4.getBackground()==Color.red && C4.getBackground()== Color.red && B4.getBackground() == Color.red)
        || (E5.getBackground()== Color.red && D5.getBackground()==Color.red && C5.getBackground()== Color.red && B5.getBackground() == Color.red)
        || (E6.getBackground()== Color.red && D6.getBackground()==Color.red && C6.getBackground()== Color.red && B6.getBackground() == Color.red)
        || (E1.getBackground()== Color.red && D2.getBackground()==Color.red && C3.getBackground()== Color.red && B4.getBackground() == Color.red)
        || (E2.getBackground()== Color.red && D3.getBackground()==Color.red && C4.getBackground()== Color.red && B5.getBackground() == Color.red)
        || (E3.getBackground()== Color.red && D4.getBackground()==Color.red && C5.getBackground()== Color.red && B6.getBackground() == Color.red)
        || (E4.getBackground()== Color.red && D3.getBackground()==Color.red && C2.getBackground()== Color.red && B1.getBackground() == Color.red)
        || (E5.getBackground()== Color.red && D4.getBackground()==Color.red && C3.getBackground()== Color.red && B2.getBackground() == Color.red)
        || (E6.getBackground()== Color.red && D5.getBackground()==Color.red && C4.getBackground()== Color.red && B3.getBackground() == Color.red)
        ){
            JOptionPane.showMessageDialog(null,J1.getText()+" Gana");
            A1.setBackground(Color.white);
            A2.setBackground(Color.white);
            A3.setBackground(Color.white);
            A4.setBackground(Color.white);
            A5.setBackground(Color.white);
            A6.setBackground(Color.white);
            B1.setBackground(Color.white);
            B2.setBackground(Color.white);
            B3.setBackground(Color.white);
            B4.setBackground(Color.white);
            B5.setBackground(Color.white);
            B6.setBackground(Color.white);
            C1.setBackground(Color.white);
            C2.setBackground(Color.white);
            C3.setBackground(Color.white);
            C4.setBackground(Color.white);
            C5.setBackground(Color.white);
            C6.setBackground(Color.white);
            D1.setBackground(Color.white);
            D2.setBackground(Color.white);
            D3.setBackground(Color.white);
            D4.setBackground(Color.white);
            D5.setBackground(Color.white);
            D6.setBackground(Color.white);
            E1.setBackground(Color.white);
            E2.setBackground(Color.white);
            E3.setBackground(Color.white);
            E4.setBackground(Color.white);
            E5.setBackground(Color.white);
            E6.setBackground(Color.white);
            previo();
            iniciar.setEnabled(true);
            iniciar.setVisible(true);
            J1.setText("");
            J2.setText("");
    }
        if((A1.getBackground()== Color.blue && A2.getBackground()== Color.blue && A3.getBackground()== Color.blue && A4.getBackground() == Color.blue)
        || (B1.getBackground()== Color.blue && B2.getBackground()== Color.blue && B3.getBackground()== Color.blue && B4.getBackground() == Color.blue)
        || (C1.getBackground()== Color.blue && C2.getBackground()== Color.blue && C3.getBackground()== Color.blue && C4.getBackground() == Color.blue)
        || (D1.getBackground()== Color.blue && D2.getBackground()== Color.blue && D3.getBackground()== Color.blue && D4.getBackground() == Color.blue)
        || (E1.getBackground()== Color.blue && E2.getBackground()== Color.blue && E3.getBackground()== Color.blue && E4.getBackground() == Color.blue)
        || (A1.getBackground()== Color.blue && B1.getBackground()== Color.blue && C1.getBackground()== Color.blue && D1.getBackground() == Color.blue)
        || (A2.getBackground()== Color.blue && B2.getBackground()== Color.blue && C2.getBackground()== Color.blue && D2.getBackground() == Color.blue)
        || (A3.getBackground()== Color.blue && B3.getBackground()== Color.blue && C3.getBackground()== Color.blue && D3.getBackground() == Color.blue)
        || (A4.getBackground()== Color.blue && B4.getBackground()== Color.blue && C4.getBackground()== Color.blue && D4.getBackground() == Color.blue)
        || (A5.getBackground()== Color.blue && B5.getBackground()== Color.blue && C5.getBackground()== Color.blue && D5.getBackground() == Color.blue)
        || (A6.getBackground()== Color.blue && B6.getBackground()== Color.blue && C6.getBackground()== Color.blue && D6.getBackground() == Color.blue)
        || (A1.getBackground()== Color.blue && B2.getBackground()== Color.blue && C3.getBackground()== Color.blue && D4.getBackground() == Color.blue)
        || (A2.getBackground()== Color.blue && B3.getBackground()== Color.blue && C4.getBackground()== Color.blue && D5.getBackground() == Color.blue)
        || (A3.getBackground()== Color.blue && B4.getBackground()== Color.blue && C5.getBackground()== Color.blue && D6.getBackground() == Color.blue)
        || (A4.getBackground()== Color.blue && B3.getBackground()== Color.blue && C2.getBackground()== Color.blue && D1.getBackground() == Color.blue)
        || (A5.getBackground()== Color.blue && B4.getBackground()== Color.blue && C3.getBackground()== Color.blue && D2.getBackground() == Color.blue)
        || (A6.getBackground()== Color.blue && B5.getBackground()== Color.blue && C4.getBackground()== Color.blue && D3.getBackground() == Color.blue)
        || (A6.getBackground()== Color.blue && A5.getBackground()== Color.blue && A4.getBackground()== Color.blue && A3.getBackground() == Color.blue)
        || (A5.getBackground()== Color.blue && A4.getBackground()== Color.blue && A3.getBackground()== Color.blue && A2.getBackground() == Color.blue)
        || (A4.getBackground()== Color.blue && A3.getBackground()== Color.blue && A2.getBackground()== Color.blue && A1.getBackground() == Color.blue)
        || (B1.getBackground()== Color.blue && C1.getBackground()== Color.blue && D1.getBackground()== Color.blue && E1.getBackground() == Color.blue)
        || (B2.getBackground()== Color.blue && C2.getBackground()== Color.blue && D2.getBackground()== Color.blue && E2.getBackground() == Color.blue)
        || (B3.getBackground()== Color.blue && C3.getBackground()== Color.blue && D3.getBackground()== Color.blue && E3.getBackground() == Color.blue)
        || (B4.getBackground()== Color.blue && C4.getBackground()== Color.blue && D4.getBackground()== Color.blue && E4.getBackground() == Color.blue)
        || (B5.getBackground()== Color.blue && C5.getBackground()== Color.blue && D5.getBackground()== Color.blue && E5.getBackground() == Color.blue)
        || (B6.getBackground()== Color.blue && C6.getBackground()== Color.blue && D6.getBackground()== Color.blue && E6.getBackground() == Color.blue)
        || (B1.getBackground()== Color.blue && C2.getBackground()== Color.blue && D3.getBackground()== Color.blue && E4.getBackground() == Color.blue)
        || (B2.getBackground()== Color.blue && C3.getBackground()== Color.blue && D4.getBackground()== Color.blue && E5.getBackground() == Color.blue)
        || (B3.getBackground()== Color.blue && C4.getBackground()== Color.blue && D5.getBackground()== Color.blue && E6.getBackground() == Color.blue)
        || (B4.getBackground()== Color.blue && C3.getBackground()== Color.blue && D2.getBackground()== Color.blue && E1.getBackground() == Color.blue)
        || (B5.getBackground()== Color.blue && C4.getBackground()== Color.blue && D3.getBackground()== Color.blue && E2.getBackground() == Color.blue)
        || (B6.getBackground()== Color.blue && C5.getBackground()== Color.blue && D4.getBackground()== Color.blue && E3.getBackground() == Color.blue)
        || (B6.getBackground()== Color.blue && B5.getBackground()== Color.blue && B4.getBackground()== Color.blue && B3.getBackground() == Color.blue)
        || (B5.getBackground()== Color.blue && B4.getBackground()== Color.blue && B3.getBackground()== Color.blue && B2.getBackground() == Color.blue)
        || (B4.getBackground()== Color.blue && B3.getBackground()== Color.blue && B2.getBackground()== Color.blue && B1.getBackground() == Color.blue)
            ){
            JOptionPane.showMessageDialog(null,J2.getText()+" Gana");
            A1.setBackground(Color.white);
            A2.setBackground(Color.white);
            A3.setBackground(Color.white);
            A4.setBackground(Color.white);
            A5.setBackground(Color.white);
            A6.setBackground(Color.white);
            B1.setBackground(Color.white);
            B2.setBackground(Color.white);
            B3.setBackground(Color.white);
            B4.setBackground(Color.white);
            B5.setBackground(Color.white);
            B6.setBackground(Color.white);
            C1.setBackground(Color.white);
            C2.setBackground(Color.white);
            C3.setBackground(Color.white);
            C4.setBackground(Color.white);
            C5.setBackground(Color.white);
            C6.setBackground(Color.white);
            D1.setBackground(Color.white);
            D2.setBackground(Color.white);
            D3.setBackground(Color.white);
            D4.setBackground(Color.white);
            D5.setBackground(Color.white);
            D6.setBackground(Color.white);
            E1.setBackground(Color.white);
            E2.setBackground(Color.white);
            E3.setBackground(Color.white);
            E4.setBackground(Color.white);
            E5.setBackground(Color.white);
            E6.setBackground(Color.white);
            previo();
            iniciar.setEnabled(true);
            iniciar.setVisible(true);
            J1.setText("");
            J2.setText("");
        }
    }
    public void mensaje(int turno){
        if(turno==1){
            JOptionPane.showMessageDialog(null,"Turno de: "+J1.getText());
        }
        if(turno==-1){
            JOptionPane.showMessageDialog(null,"Turno de: "+J2.getText());
        }
    }
    public void previo(){
        A1.setEnabled(false);
        A2.setEnabled(false);
        A3.setEnabled(false);
        A4.setEnabled(false);
        A5.setEnabled(false);
        A6.setEnabled(false);
        B1.setEnabled(false);
        B2.setEnabled(false);
        B3.setEnabled(false);
        B4.setEnabled(false);
        B5.setEnabled(false);
        B6.setEnabled(false);
        C1.setEnabled(false);
        C2.setEnabled(false);
        C3.setEnabled(false);
        C4.setEnabled(false);
        C5.setEnabled(false);
        C6.setEnabled(false);
        D1.setEnabled(false);
        D2.setEnabled(false);
        D3.setEnabled(false);
        D4.setEnabled(false);
        D5.setEnabled(false);
        D6.setEnabled(false);
        E1.setEnabled(false);
        E2.setEnabled(false);
        E3.setEnabled(false);
        E4.setEnabled(false);
        E5.setEnabled(false);
        E6.setEnabled(false);
    }
    public void ver(){
        A1.setEnabled(true);
        A2.setEnabled(true);
        A3.setEnabled(true);
        A4.setEnabled(true);
        A5.setEnabled(true);
        A6.setEnabled(true);
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        C1.setEnabled(true);
        C2.setEnabled(true);
        C3.setEnabled(true);
        C4.setEnabled(true);
        C5.setEnabled(true);
        C6.setEnabled(true);
        D1.setEnabled(true);
        D2.setEnabled(true);
        D3.setEnabled(true);
        D4.setEnabled(true);
        D5.setEnabled(true);
        D6.setEnabled(true);
        E1.setEnabled(true);
        E2.setEnabled(true);
        E3.setEnabled(true);
        E4.setEnabled(true);
        E5.setEnabled(true);
        E6.setEnabled(true);
    }
    public static void main(String[] args) {
        JFrame conecta = new JFrame("tablero");
        conecta.setContentPane(new C4().tablero);
        conecta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conecta.pack();
        conecta.setVisible(true);
    }
}


