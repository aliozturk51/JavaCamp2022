package kodlamaIo.entities;

public class Course {
	private int id;
	private String courseName;
	private String ınstructorName;
	private String description;
	private double price;

	public Course() {

	}

	public Course(int id, String courseName, String instructorName, String description, double price) {
		this.id = id;
		this.courseName = courseName;
		ınstructorName = instructorName;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return ınstructorName;
	}

	public void setInstructorName(String instructorName) {
		ınstructorName = instructorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
