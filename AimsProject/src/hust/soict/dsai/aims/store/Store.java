package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<>();
    
	public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("The media item has been added to the store.");
    }

    public void removeMedia(String title) {
        for (Media media : itemsInStore) {
            if (media != null && media.getTitle().equals(title)) {
                itemsInStore.remove(media);
                System.out.println("The media item with title '" + title + "' has been removed from the store.");
                return;
            }
        }
        System.out.println("Media item with title '" + title + "' not found in the store.");
    }

    // Method to print the DVDs currently in the store
    public void displayItemsInStore() {
        System.out.println("\n-------------------------------- \n Media items in the store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("-------------------------------- \n ");
    }
    public void addMediaToCart(String title, Cart cart) {
        Media media = getMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
        } else {
            System.out.println("Media item with title '" + title + "' not found in the store.");
        }
    }
    
    public Media getMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media != null && media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void displayMediaDetails(String title) {
        Media media = getMediaByTitle(title);
        if (media != null) {
            System.out.println(media.toString());
            //mediaDetailsMenu();
        } else {
            System.out.println("Media item with title '" + title + "' not found in the store.");
        }
    }

    public void playMedia(String title) {
        Media media = getMediaByTitle(title);
        if (media != null) {
            if (media instanceof Playable) {
                ((Playable) media).play();
            } else {
                System.out.println("This media is not playable.");
            }
        } else {
            System.out.println("Media item with title '" + title + "' not found in the store.");
        }
    }
    
}
