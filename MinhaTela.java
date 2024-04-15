/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minhatela;

/**
 *
 * @author mdrumond
 */
import javax.swing.*;
import java.awt.*;

public class MinhaTela extends JFrame {
    private JTextField campoTexto1, campoTexto2, campoTexto3;
    private JButton botao1, botao2;

    public MinhaTela() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null); 
        campoTexto1 = new JTextField(50);
        campoTexto2 = new JTextField(50);
        botao1 = new JButton("Entrar");
        botao2 = new JButton("Voltar");
        setLayout(new GridLayout(12, 8)); 
        add(new JLabel("E-mail ou Matricula"));
        add(campoTexto1);
        add(new JLabel("Senha: "));
        add(campoTexto2);
        add(botao1);
        add(botao2);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MinhaTela();
            }
        });
    }
}
