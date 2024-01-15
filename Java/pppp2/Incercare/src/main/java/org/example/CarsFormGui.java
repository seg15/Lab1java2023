package org.example;
import javax.swing.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class CarsFormGui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Car Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        placeComponents(panel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JTextField brandField = new JTextField(20);
        JTextField modelField = new JTextField(20);
        JTextField transmissionField = new JTextField(20);
        JTextField colorField = new JTextField(20);

        panel.add(new JLabel("Brand:"));
        panel.add(brandField);

        panel.add(new JLabel("Model:"));
        panel.add(modelField);

        panel.add(new JLabel("Transmisie:"));
        panel.add(transmissionField);

        panel.add(new JLabel("Culoare:"));
        panel.add(colorField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String brand = brandField.getText();
            String model = modelField.getText();
            String transmission = transmissionField.getText();
            String color = colorField.getText();

            // Creare obiect Car
            Car car = new Car(brand, model, transmission, color);

            // Convertirea obiectului Car într-un fișier JSON
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                objectMapper.writeValue(new File("car_data.json"), car);
                JOptionPane.showMessageDialog(panel, "Informații salvate în car_data.json");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        panel.add(submitButton);
    }
}