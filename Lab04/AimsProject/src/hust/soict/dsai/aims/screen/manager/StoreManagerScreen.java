package hust.soict.dsai.aims.screen.manager;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreManagerScreen extends JFrame{
	private Store store;
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}

	JMenuBar createMenuBar() {
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

	JPanel createHeader(){
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}

	JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media);
            center.add(cell);
        }
        return center;
    }
	
	
	public StoreManagerScreen(Store store) {
		this.store = store;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	public static void main(String[] args) {
        Store store = new Store();  
        
//        store.addMedia(new Book(1, "Harry Potter", "Fantasy", 29.99f, Arrays.asList("J.K. Rowling")));
//        store.addMedia(new Book(2, "The Lord of the Rings", "Fantasy", 39.99f, Arrays.asList("J.R.R. Tolkien")));
//        store.addMedia(new CompactDisc("Thriller", 1, "Michael Jackson"));
//        store.addMedia(new CompactDisc("Back in Black", 2, "AC/DC"));
//        store.addMedia(new DigitalVideoDisc("The Matrix", "Wachowskis", 24.99f));
//        store.addMedia(new DigitalVideoDisc("The Godfather", "Francis Ford Coppola", 29.99f));

        
        new StoreManagerScreen(store);
    }
	
}
