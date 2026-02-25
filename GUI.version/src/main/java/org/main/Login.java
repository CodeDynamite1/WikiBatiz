package org.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

    private JPanel LoginPanel;
    private JPasswordField passwordField1;
    private JButton iniciarSesiónButton;
    private JCheckBox mantenerSesiónIniciadaCheckBox;
    private JButton creaUnaNuevaCuentaButton;
    private JTextField textField1;
    private JButton MinimizeButton;
    private JButton CloseOperation;

    public Login(){
        setTitle("WikiBatiz - Login");
        setContentPane(LoginPanel);
        setSize(300,375);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
        CloseOperation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Color rojo = new Color(255,0,0);
                CloseOperation.setBackground(rojo);
            }
        });
        CloseOperation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Color blanco = new Color(43,45,48);
                CloseOperation.setBackground(blanco);
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
