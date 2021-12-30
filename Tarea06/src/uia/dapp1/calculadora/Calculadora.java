package uia.dapp1.calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Calculadora {
    private JPanel MainPanel;
    private JPanel mostrar;
    private JButton seis;
    private JButton ocho;
    private JButton cuatro;
    private JButton cinco;
    private JButton siete;
    private JButton nueve;
    private JButton dos;
    private JButton cero;
    private JButton Entre;
    private JButton uno;
    private JButton mas;
    private JButton por;
    private JButton menos;
    private JButton tres;
    private JButton limpiar;
    private JTextField entrada;
    private JTextField resultado;
    private JButton Igual;
    private String numeros = " ";
    private double primero;
    private double segundo;
    private String operacion;
    private List<Double> array = null;
    private List<String> array2 = null;
    Double res;

    public Calculadora() {
        array = new ArrayList<>();
        array2 = new ArrayList<>();
        cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "0";
                entrada.setText(numeros);
                array.add(Double.parseDouble("0"));
            }
        });
        uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "1";
                entrada.setText(numeros);
                array.add(Double.parseDouble("1"));
            }
        });
        dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "2";
                entrada.setText(numeros);
                array.add(Double.parseDouble("2"));
            }
        });
        tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "3";
                entrada.setText(numeros);
                array.add(Double.parseDouble("3"));
            }
        });
        cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "4";
                entrada.setText(numeros);
                array.add(Double.parseDouble("4"));
            }
        });
        cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "5";
                entrada.setText(numeros);
                array.add(Double.parseDouble("5"));
            }
        });
        seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "6";
                entrada.setText(numeros);
                array.add(Double.parseDouble("6"));
            }
        });
        siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "7";
                entrada.setText(numeros);
                array.add(Double.parseDouble("7"));
            }
        });
        ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "8";
                entrada.setText(numeros);
                array.add(Double.parseDouble("8"));
            }
        });
        nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros += "9";
                entrada.setText(numeros);
                array.add(Double.parseDouble("9"));
            }
        });
        mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primero = Double.parseDouble(numeros);
                operacion = "+";
                numeros = "";
                entrada.setText("");
                array2.add("+");
            }
        });
        menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primero = Double.parseDouble(numeros);
                operacion = "-";
                numeros = "";
                entrada.setText("");
                array2.add("-");
            }
        });
        por.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primero = Double.parseDouble(numeros);
                operacion = "*";
                numeros = "";
                entrada.setText("");
                array2.add("*");
            }
        });
        Entre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primero = Double.parseDouble(numeros);
                operacion = "/";
                numeros = "";
                entrada.setText("");
                array2.add("/");
            }
        });
        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array2.add("=");
                segundo = Double.parseDouble(numeros);
                switch (operacion) {
                    case "+":
                        res = Operaciones.suma(primero, segundo);
                        resultado.setText(res + "");
                        break;
                    case "-":
                        res = Operaciones.resta(primero, segundo);
                        resultado.setText(res + "");
                        break;
                    case "*":
                        res = Operaciones.division(primero, segundo);
                        resultado.setText(res + "");
                        break;
                    case "/":
                        res = Operaciones.multiplicacion(primero, segundo);
                        resultado.setText(res + "");
                        break;
                }
            }
        });
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numeros = " ";
                entrada.setText("");
                resultado.setText("");
            }
        });
        entrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        resultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
