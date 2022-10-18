package kodlamaIo;

import java.util.List;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.HibernateCategoryDao;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.dataAccess.HibernateInstructorDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category(3, "Frontend");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);

		Course course = new Course(1, " Flutter", " Engin Demiroğ", " Sıfırdan Yazılım ", 10);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);

		Instructor instructor = new Instructor(1, " Emir", " Ünal", 17);
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
	}

}
