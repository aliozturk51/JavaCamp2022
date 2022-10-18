package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		
	}

	public void add(Course course) throws Exception {
		Course[] courses = {new Course(1, " Java", " Engin Demiroğ", " Sıfırdan Yazılım ", 50),
				new Course(2, " C#",  " Engin Demiroğ", " Sıfırdan Sektöre Hazırlık ", 50)};
		for (Course cour : courses) {
			if(course.getCourseName().equals(cour.getCourseName())) {
				throw new Exception("Kurs isimleri tekrar edemez.");
			}
			else if (course.getPrice()<0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
			}
		}

		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getId()  + course.getCourseName() + course.getInstructorName() + course.getDescription() +
			course.getPrice());
		}
	}
}
