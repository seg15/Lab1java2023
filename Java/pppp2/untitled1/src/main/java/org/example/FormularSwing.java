package org.example;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FormularSwing extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox checkBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JComboBox<String> comboBox;

    public FormularSwing() {
        setTitle("Vacanta perfecta");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crearea componentelor UI
        JLabel label1 = new JLabel("Unde ai vrea sa mergi in vacanta:");
        textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Descrie vacanta perfecta:");
        textField2 = new JTextField(20);

        JLabel label3 = new JLabel("Meriti o vacanta?:");
        checkBox = new JCheckBox("Da");

        JLabel label4 = new JLabel("Cu cine mergi in vacanta?:");
        radioButton1 = new JRadioButton("Singur");
        radioButton2 = new JRadioButton("Cu familia");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);

        JLabel label5 = new JLabel("Cate zile:");
        String[] options = {"3zile ", "5 zile ", "mai multe"};
        comboBox = new JComboBox<>(options);

        JButton saveButton = new JButton("Salvează");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton cancelButton = new JButton("Anulează");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adăugarea componentelor la container
        Container container = getContentPane();
        container.setLayout(new GridLayout(7, 2));

        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);
        container.add(label3);
        container.add(checkBox);
        container.add(label4);
        container.add(radioButton1);
        container.add(new JLabel(""));
        container.add(radioButton2);
        container.add(label5);
        container.add(comboBox);
        container.add(saveButton);
        container.add(cancelButton);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularSwing().setVisible(true);
            }
        });
    }
}