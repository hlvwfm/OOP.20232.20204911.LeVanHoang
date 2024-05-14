package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField titleField;
    private JTextField authorField;
    private JTextField priceField;

    public AddBookToStoreScreen(Store store) {
        super(store);
    }

    @Override
    protected JPanel createCenter() {
        JPanel panel = new JPanel(new GridLayout(0, 2));

        panel.add(new JLabel("Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Author:"));
        authorField = new JTextField();
        panel.add(authorField);

        panel.add(new JLabel("Price:"));
        priceField = new JTextField();
        panel.add(priceField);

        return panel;
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String author = authorField.getText();
        float price = Float.parseFloat(priceField.getText());
        // Add book to store
        // store.addMedia(new Book(title, author, price));
        JOptionPane.showMessageDialog(this, "Book added successfully!");
        this.dispose();
    }
}
