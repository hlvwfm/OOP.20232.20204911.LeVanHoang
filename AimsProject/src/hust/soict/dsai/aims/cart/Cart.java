package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	private static float cost = 0.0f;
	private static int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrder[qtyOrdered] = disc;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered >= 19) {
			System.out.println("Exceeds the permitted limits");
		}
		else {
			itemsOrder[qtyOrdered] = dvd1;
			System.out.println("The disc has been added");
			qtyOrdered ++;
			itemsOrder[qtyOrdered] = dvd2;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc ... dvds) {
		int len = dvds.length;
		if (qtyOrdered + len < MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < len; i++) {
				System.out.println("The disc has been added");
				itemsOrder[qtyOrdered] = dvds[i];
				qtyOrdered ++;
			}
		}
	
		else {
				System.out.println("The cart is almost full");
		}

	}
	public void  removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean check = true;
		DigitalVideoDisc copy[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		if (qtyOrdered == 0) {
			System.out.println("No disc in cart");
			return;
		}
		for (int i = 0; i<itemsOrder.length;i++) {
			if (itemsOrder[i] == disc) {
				check = false;
				itemsOrder[i] = null;
				qtyOrdered -=1;
				for (int j = 0,k=0;j<copy.length;j++) {
					if (itemsOrder[j] != null) {
						copy[k++] = itemsOrder[j];
					}
				}
				itemsOrder = copy;
				System.out.println("The disc has been removed");
				break;
				}
			}
		if (check == true) {
			System.out.println("The disc is not in cart");
		}
	}
	public float totalCost() {
        float total = 0.0f;
        for (int i = 0; i < qtyOrdered; i++) {
            // Accumulate the cost of each item in the cart
            total += itemsOrder[i].getCost();
        }
        return total;
    }
	
	public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrder[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchByTitle (String title) {
        int match = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] != null && itemsOrder[i].getTitle().equals(title)) {
                System.out.println((i + 1) + ". " + itemsOrder[i].toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }

    public void searchByID (int id){
        int match = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] != null && i +1 == id) {
                System.out.println((i + 1) + ". " + itemsOrder[i].toString());
                match = 1;
            }
        }
        if (match == 0) {
            System.out.println("Not found");
        }
    }
	
	
}

