package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Media {

	private int id;
    protected String title;
    private String category;
    private float cost;
	
	public Media() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Media(String title) {
        super();
        this.title = title;
    }

    public Media(String title, float cost) {
        this(title);
        this.cost = getCost();
    }
    
    
    public void initializeMediaList() {
        List<Media> mediaList = new ArrayList<Media>();

        // Create instances of CD, DVD, or Book
        CompactDisc cd = new CompactDisc("Artist", 120, "Director");
        DigitalVideoDisc dvd = new DigitalVideoDisc("DVD Title");
        Book book = new Book(100,"Book Title", "category",29.99f, Collections.singletonList("Author"));

        // Add them to the mediaList
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);

        for (Media media : mediaList) {
            System.out.println(media.toString() + "\n");
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title.equals(media.title);
    }
	
}
