package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a store with a capacity of 5 DVDs
        Store myStore = new Store(5);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        // Add DVDs to the store
        myStore.addDVD(dvd1);
        myStore.addDVD(dvd2);

        // Display DVDs in the store
        myStore.displayItemsInStore();

        // Remove a DVD from the store
        myStore.removeDVD("The Lion King");

        // Display updated DVDs in the store
        myStore.displayItemsInStore();
    }
}
