package kodlamaIo;

import java.util.List;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.HibernateCategoryDao;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
//	Category category = new Category(2,"C#");
	Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
//		
//	CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
//	categoryManager.add(category);
		
	Course course = new Course(1, " " + "Java", " " +  "Engin Demiroğ" ,  " "  +"Sıfırdan Java" + " " , 1 );
	CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
	courseManager.add(course);
	
		

	}

}
