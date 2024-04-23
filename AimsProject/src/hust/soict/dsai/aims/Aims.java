package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("OnePiece","Animation",69.96f);
		//anOrder.addDigitalVideoDisc(dvd4);
		//anOrder.removeDigitalVideoDisc(dvd4);
		//System.out.println("Total Cost is: "+anOrder.totalCost());
		//anOrder.addDigitalVideoDisc(dvd1, dvd2);
		
		anOrder.printOrder();
        anOrder.searchByTitle("Star Wars");
        anOrder.searchByID(1);
		
	}

}