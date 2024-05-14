package hust.soict.dsai.aims;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import java.util.Scanner;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		Store store = new Store();
//		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
//		//anOrder.addDigitalVideoDisc(dvd1);
//		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
//		//anOrder.addDigitalVideoDisc(dvd2);
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
//		//anOrder.addDigitalVideoDisc(dvd3);
//		DigitalVideoDisc dvd4 = new DigitalVideoDisc("OnePiece","Animation",69.96f);
//		//anOrder.addDigitalVideoDisc(dvd4);
//		//anOrder.removeDigitalVideoDisc(dvd4);
//		//System.out.println("Total Cost is: "+anOrder.totalCost());
//		//anOrder.addDigitalVideoDisc(dvd1, dvd2);
//		
//		anOrder.printOrder();
//        anOrder.searchByTitle("Star Wars");
//        anOrder.searchByID(1);
		
		Scanner scanner = new Scanner(System.in);
        int mainMenuChoice;
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            mainMenuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (mainMenuChoice) {
                case 1:
                    displayItemsInStore(store);
                    storeMenu(scanner, store, anOrder);
                    break;
                case 2:
                    updateStoreMenu(scanner, store);
                    break;
                case 3:
                    anOrder.printOrder();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (mainMenuChoice != 0);
		
	}
	
	private static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
    }

    private static void storeMenu(Scanner scanner, Store store, Cart cart) {
        int storeMenuChoice;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice: ");
            storeMenuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (storeMenuChoice) {
                case 1:
                    seeMediaDetails(scanner, store);
                    break;
                case 2:
                    addMediaToCart(scanner, store, cart);
                    break;
                case 3:
                    playMedia(scanner, store);
                    break;
                case 4:
                    cart.printOrder();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (storeMenuChoice != 0);
    }
    
    private static void displayItemsInStore(Store store) {
        store.displayItemsInStore();
    }

    private static void seeMediaDetails(Scanner scanner, Store store) {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        store.displayMediaDetails(title);
    }

    private static void addMediaToCart(Scanner scanner, Store store, Cart cart) {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        store.addMediaToCart(title, cart);
    }

    private static void playMedia(Scanner scanner, Store store) {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        store.playMedia(title);
    }

    private static void updateStoreMenu(Scanner scanner, Store store) {
        int updateStoreChoice;

        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to the store");
            System.out.println("2. Remove a media from the store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Enter your choice: ");
            updateStoreChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (updateStoreChoice) {
                case 1:
                    addMediaToStore(scanner, store);
                    break;
                case 2:
                    removeMediaFromStore(scanner, store);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (updateStoreChoice != 0);
    }

    private static void addMediaToStore(Scanner scanner, Store store) {
        DigitalVideoDisc Disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87,19.95f);
        DigitalVideoDisc Disc2 = new DigitalVideoDisc("Star Wars" ,"Science Fiction" , "George Lucas" ,87, 24.95f);
        store.addMedia(Disc1);
        store.addMedia(Disc2);
        System.out.println("Media added to the store.");
    }

    private static void removeMediaFromStore(Scanner scanner, Store store) {
        System.out.print("Enter the title of the media to remove: ");
        String titleToRemove = scanner.nextLine();
        store.removeMedia(titleToRemove);
    }

    

}