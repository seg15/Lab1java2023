package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class FormularUI extends JFrame {
    private JTextField numeField, prenumeField, varstaField;
    private JCheckBox elevCheckBox, studentCheckBox;
    private JButton saveButton, cancelButton;

    public FormularUI() {
        setTitle("Formular Persoana");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        numeField = new JTextField(20);
        prenumeField = new JTextField(20);
        varstaField = new JTextField(3);

        elevCheckBox = new JCheckBox("Elev");
        studentCheckBox = new JCheckBox("Student");

        saveButton = new JButton("Salvare");
        cancelButton = new JButton("Anulare");

        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nume:"));
        add(numeField);

        add(new JLabel("Prenume:"));
        add(prenumeField);

        add(new JLabel("Varsta:"));
        add(varstaField);

        add(new JLabel("Statut:"));
        JPanel statutPanel = new JPanel();
        statutPanel.add(elevCheckBox);
        statutPanel.add(studentCheckBox);
        add(statutPanel);

        add(saveButton);
        add(cancelButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvareDate();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void salvareDate() {
        String nume = numeField.getText();
        String prenume = prenumeField.getText();
        String varsta = varstaField.getText();
        String statut = "";

        if (elevCheckBox.isSelected()) {
            statut = "Elev";
        } else if (studentCheckBox.isSelected()) {
            statut = "Student";
        }

        String linie = nume + ", " + prenume + ", " + varsta + ", " + statut + "\n";

        try (FileWriter file = new FileWriter("date.txt", true)) {
            file.write(linie);
            JOptionPane.showMessageDialog(this, "Datele au fost salvate cu succes!");
            clearFields();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Eroare la salvarea datelor!");
        }
    }

    private void clearFields() {
        numeField.setText("");
        prenumeField.setText("");
        varstaField.setText("");
        elevCheckBox.setSelected(false);
        studentCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularUI().setVisible(true);
            }
        });
    }
}