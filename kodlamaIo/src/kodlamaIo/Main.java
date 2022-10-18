package kodlamaIo;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.dataAccess.HibernateCategoryDao;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
//		Category category = new Category(1, "");
//		
//		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
//		categoryManager.add(category);
		
		Course course = new Course(1,"Java","Engin Demiroğ", "Sıfırdan Java", -1);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao());
		courseManager.add(course);
		

	}

}
