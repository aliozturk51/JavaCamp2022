package kodlamaIo.entities;

public class Course {
	private int id;
	private String courseName;
	private String ─▒nstructorName;
	private String description;
	private double price;

	public Course() {

	}

	public Course(int id, String courseName, String instructorName, String description, double price) {
		this.id = id;
		this.courseName = courseName;
		─▒nstructorName = instructorName;
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
		return ─▒nstructorName;
	}

	public void setInstructorName(String instructorName) {
		─▒nstructorName = instructorName;
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
