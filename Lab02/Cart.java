public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	private static float cost = 0.0f;
	private static int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
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
			itemsOrdered[qtyOrdered] = dvd1;
			System.out.println("The disc has been added");
			qtyOrdered ++;
			itemsOrdered[qtyOrdered] = dvd2;
			System.out.println("The disc has been added");
			qtyOrdered ++;
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc ... dvds) {
		int len = dvds.length;
		if (qtyOrdered + len < MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < len; i++) {
				System.out.println("The disc has been added");
				itemsOrdered[qtyOrdered] = dvds[i];
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
		for (int i = 0; i<itemsOrdered.length;i++) {
			if (itemsOrdered[i] == disc) {
				check = false;
				itemsOrdered[i] = null;
				qtyOrdered -=1;
				for (int j = 0,k=0;j<copy.length;j++) {
					if (itemsOrdered[j] != null) {
						copy[k++] = itemsOrdered[j];
					}
				}
				itemsOrdered = copy;
				System.out.println("The disc has been removed");
				break;
				}
			}
		if (check == true) {
			System.out.println("The disc is not in cart");
		}
	}
	public void totalCost(){
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		System.out.println(sum);
		
	}
}

