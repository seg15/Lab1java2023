package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Proj extends JFrame {

    Proj() {


        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(11, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel lNume, lPrenume, lVarsta, lEmpty, lEmptyTwo, lEmptyThree;
        JTextField fNume, fPrenume, fVarsta;
        JButton btnSave, btnExit;
        JRadioButton rdM, rdF;
        lEmpty = new JLabel("");
        lEmptyTwo = new JLabel("");
        lEmptyThree = new JLabel("");
        lNume = new JLabel("Nume:");
        fNume = new JTextField(20);
        fPrenume = new JTextField(20);
        lPrenume = new JLabel("Prenume:");
        fVarsta = new JTextField(20);
        lVarsta = new JLabel("Varsta:");
        btnSave = new JButton("Salvare");
        btnExit = new JButton("Anulare");
        rdM= new JRadioButton("Barbat");
        rdF = new JRadioButton("Femeie");
        p1.add(lNume);
        p1.add(fNume);
        p1.add(lPrenume);
        p1.add(fPrenume);
        p1.add(lVarsta);
        p1.add(fVarsta);
        p1.add(rdM);
        p1.add(rdF);
        p1.add(lEmptyTwo);
        p1.add(lEmptyThree);


        rdM.setSelected(true);
        rdM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdM.isSelected()) {
                    rdF.setSelected(false);
                }
                if(!rdM.isSelected()) {
                    rdM.setSelected(true);
                }
            }
        });
        rdF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rdF.isSelected()) {
                    rdM.setSelected(false);
                }
                if(!rdF.isSelected()) {
                    rdF.setSelected(true);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        //=========================================================
        p2.add(btnSave);
        p2.add(btnExit);
        add(p1, "North");
        add(p2, "South");
        setVisible(true);
        this.setSize(500, 500);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnExit.isEnabled()) {
                    System.exit(0);
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    Person person = new Person();
                    person.setNume(fNume.getText());
                    person.setPrenume(fPrenume.getText());
                    person.setVarsta(fVarsta.getText());
                    JOptionPane.showMessageDialog(null, "Executat cu succes!");
                    ObjectMapper mapper = new ObjectMapper();
                    String showJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
                    String jsonString = mapper.writeValueAsString(person);
                    System.out.println(showJson);
                    System.out.println("Se rescrie din JSON in obiect (DEBUG): ");
                    Person masinaHelp = mapper.readValue(jsonString, Person.class);

                    FileWriter myWriter = new FileWriter("proba.txt");
                    myWriter.write(jsonString);
                    myWriter.close();
                }
                catch (IOException f){
                    System.out.println("S-a produs o eroare. Executia programului se va opri.");
                    f.printStackTrace();
                }
                //DEBUG JOptionPane.showMessageDialog(null, masina.getMarca());
            }
        });
    }

    // Main Method

    public static void main(String[] args) {
        new Proj();
    }

}