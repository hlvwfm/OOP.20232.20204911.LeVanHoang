package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public abstract class AddItemToStoreScreen extends JFrame {
    protected Store store;

    public AddItemToStoreScreen(Store store) {
        this.store = store;

        setTitle("Add Item");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        add(createNorth(), BorderLayout.NORTH);
        add(createCenter(), BorderLayout.CENTER);
        add(createSouth(), BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    private JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenuItem viewStore = new JMenuItem("View Store");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBook = new JMenuItem("Add Book");
        JMenuItem addCD = new JMenuItem("Add CD");
        JMenuItem addDVD = new JMenuItem("Add DVD");

        smUpdateStore.add(addBook);
        smUpdateStore.add(addCD);
        smUpdateStore.add(addDVD);

        menu.add(viewStore);
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        // Add menu actions
        addMenuActions(addBook, addCD, addDVD, viewStore);

        return menuBar;
    }

    private void addMenuActions(JMenuItem addBook, JMenuItem addCD, JMenuItem addDVD, JMenuItem viewStore) {
        addBook.addActionListener(e -> new AddBookToStoreScreen(store));
        addCD.addActionListener(e -> new AddCompactDiscToStoreScreen(store));
        addDVD.addActionListener(e -> new AddDigitalVideoDiscToStoreScreen(store));
        viewStore.addActionListener(e -> new StoreManagerScreen(store));
    }

    private JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    protected abstract JPanel createCenter();

    private JPanel createSouth() {
        JPanel south = new JPanel();
        JButton addButton = new JButton("Add");
        south.add(addButton);
        addButton.addActionListener(e -> addItem());
        return south;
    }

    protected abstract void addItem();
}
