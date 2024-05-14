package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField titleField;
    private JTextField artistField;
    private JTextField priceField;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
    }

    @Override
    protected JPanel createCenter() {
        JPanel panel = new JPanel(new GridLayout(0, 2));

        panel.add(new JLabel("Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Artist:"));
        artistField = new JTextField();
        panel.add(artistField);

        panel.add(new JLabel("Price:"));
        priceField = new JTextField();
        panel.add(priceField);

        return panel;
    }

    @Override
    protected void addItem() {
        String title = titleField.getText();
        String artist = artistField.getText();
        float price = Float.parseFloat(priceField.getText());
        // Add CD to store
        // store.addMedia(new CompactDisc(title, artist, price));
        JOptionPane.showMessageDialog(this, "CD added successfully!");
        this.dispose();
    }
}
