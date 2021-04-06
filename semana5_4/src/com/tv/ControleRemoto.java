package com.tv;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Scanner;

public class ControleRemoto {

    Televisao televisao = new Televisao(0, 0);

    public static void main(String[] args) {
        new ControleRemoto();
    }
    public ControleRemoto() {
        JFrame frame = new JFrame("Test");
        frame.setSize(2000, 700);
        frame.add(new MenuPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public class MenuPane extends JPanel {
        public MenuPane() {
            setBorder(new EmptyBorder(30, 50, 50, 50));
            setVisible(true);
            setLayout(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.NORTH;

                add(new JLabel("<html><h1><strong><i>Resultados no console</i></strong></h1></html>"), gbc);

            gbc.anchor = GridBagConstraints.CENTER;
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JButton DiminuiVolume = new JButton("volume -");
            JButton AumentaVolume = new JButton("volume +");
            JButton DesceCanal = new JButton("canal -");
            JButton SobeCanal = new JButton("canal +");
            JButton Sair = new JButton("sair")  ;

            JPanel buttons = new JPanel(new GridBagLayout());
            buttons.add(DiminuiVolume);
            buttons.add(AumentaVolume);
            buttons.add(DesceCanal);
            buttons.add(SobeCanal);
            buttons.add(Sair);
            gbc.weighty = 1;
            add(buttons, gbc);

            DiminuiVolume.addActionListener(e -> alterarVolume("diminui"));
            AumentaVolume.addActionListener(e -> alterarVolume("aumenta"));
            DesceCanal.addActionListener(e -> alteraCanal("diminui"));
            SobeCanal.addActionListener(e -> alteraCanal("aumenta"));
            Sair.addActionListener(e -> {
                System.exit(0);
            });
        }
    }


    private void alterarVolume(String action) {
        if (action == "aumenta") {
            System.out.println(televisao.exibeDados());
            televisao.aumentaVolume();
        } else {
            System.out.println(televisao.exibeDados());
            televisao.diminuiVolume();
        }
    }

    private void alteraCanal(String action) {
        if (action == "aumenta") {
            System.out.println(televisao.exibeDados());
            televisao.sobeCanal();
        } else {
            System.out.println(televisao.exibeDados());
            televisao.desceCanal();
        }
    }
}
