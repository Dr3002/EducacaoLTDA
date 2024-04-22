package Interface;
import java.awt.Font;

import javax.swing.*;

public class Screen extends JFrame {
    public Screen(){
        //Titulo da página
        setTitle("Controle Acadêmico Visão Educação LTDA");
        setVisible(true);
        setSize(1250,750);
        //Fechar a operação
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //Travar o tamanho da tela
        setResizable(false);
        //Centralizar a tela no centro
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Bem-vindo ao Sistema de Controle Acadêmico Visão Educação LTDA!");
        label.setBounds(180, 80, 1000, 50);
        label.setFont(new Font("Arial",Font.BOLD,30));
        add(label);

        setLayout(null);

        //Botão 
        JButton jButton = new JButton("Acesso Aluno");
        jButton.setBounds(200,250,250,70);
        jButton.setFont(new Font("Arial",Font.BOLD,20));
        add(jButton);

        JButton jButton2 = new JButton("Acesso Professor");
        jButton2.setBounds(800,250,250,70);
        jButton2.setFont(new Font("Arial",Font.BOLD,20));
        add(jButton2);
    }
}
