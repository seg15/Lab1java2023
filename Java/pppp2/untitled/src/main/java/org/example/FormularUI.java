package org.example;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FormularUI extends JFrame {
    private JTextField numeField, prenumeField, varstaField;
    private JCheckBox elevCheckBox, studentCheckBox;
    private JButton cancelButton;
    private JTable dataTable;
    private DefaultTableModel tableModel;

    public FormularUI() {
        setTitle("Formular și Tabel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        numeField = new JTextField(20);
        prenumeField = new JTextField(20);
        varstaField = new JTextField(3);

        elevCheckBox = new JCheckBox("Elev");
        studentCheckBox = new JCheckBox("Student");

        cancelButton = new JButton("Anulare");

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nume");
        tableModel.addColumn("Prenume");
        tableModel.addColumn("Varsta");
        tableModel.addColumn("Statut");

        dataTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.setPreferredSize(new Dimension(400, 150));

        setLayout(new GridLayout(7, 2));


        numeField.setText("Popescu");
        prenumeField.setText("Ion");
        varstaField.setText("25");
        elevCheckBox.setSelected(true);

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

        add(new JLabel());
        add(cancelButton);

        add(scrollPane);

        cancelButton.addActionListener(e -> System.exit(0));

        incarcaDateInTabel("date.json");
    }

    private void incarcaDateInTabel(String fisier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fisier))) {
            String linie;
            while ((linie = reader.readLine()) != null) {
                String[] date = linie.split(",");
                adaugaInTabel(date[0].trim(), date[1].trim(), date[2].trim(), date[3].trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void adaugaInTabel(String nume, String prenume, String varsta, String statut) {
        tableModel.addRow(new String[]{nume, prenume, varsta, statut});
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormularUI().setVisible(true));
    }
}