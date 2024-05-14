package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private int id;
	private String title;
	private String category;
	private String directory;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
	}
	
	public DigitalVideoDisc( String title,String category, float cost) {
		this(title); 
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.category = category; 
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this(title, category, cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.directory = director;

	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		this(title, category, directory, cost);
		nbDigitalVideoDiscs +=1;
		this.id = nbDigitalVideoDiscs;
		this.length = length;

		
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return directory;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getID() {
		return id;
	}
	
	public void getDetail() {
		System.out.printf("DVD -  %s - %s - %s - %d: %f $\n",title,
				category,directory,length,cost);
	}
	
	public boolean search(String title) {
        return this.title.contains(title);
    }
	
	public String toString() {
        return "DVD - " + id + " - " + title + " - " + category + " - " + directory + " - " + length + " minutes: " + cost + " $";
    }
	
	
	public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength() + " minutes");
    }
	
}