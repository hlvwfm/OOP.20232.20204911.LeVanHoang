package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField titleField;
    private JTextField directorField;
    private JTextField priceField;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
    }

    @Override
    protected JPanel createCenter() {
        JPanel panel = new JPanel(new GridLayout(0, 2));

        panel.add(new JLabel("Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Director:"));
        directorField = new JTextField();
        panel.add(directorField);

        panel.add(new JLabel("Price:"));
        priceField = new JTextField();
        panel.add(priceField);

        return panel;
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String director = directorField.getText();
        float price = Float.parseFloat(priceField.getText());
        // Add DVD to store
        // store.addMedia(new DigitalVideoDisc(title, director, price));
        JOptionPane.showMessageDialog(this, "DVD added successfully!");
        this.dispose();
    }
}
