package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private static float cost = 0.0f;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	
	public void addMedia(Media media) {
        // Add the media to the ArrayList
        itemsOrdered.add(media);
        System.out.println("The item has been added to the cart.");
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The item has been removed from the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }
	
    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
	
    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    
    public void searchByTitle(String title) {
        int match = 0;
        for (Media media : itemsOrdered) {
            if (media != null && media.getTitle().equals(title)) {
                System.out.println((itemsOrdered.indexOf(media) + 1) + ". " + media.toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }

    public void searchByID(int id) {
        int match = 0;
        for (Media media : itemsOrdered) {
            if (media != null && itemsOrdered.indexOf(media) + 1 == id) {
                System.out.println((itemsOrdered.indexOf(media) + 1) + ". " + media.toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }



    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
	
	
}

