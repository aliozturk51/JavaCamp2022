package kodlamaIo.business;

import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;

	public CourseManager(CourseDao courseDao) {

		this.courseDao = courseDao;
	}

	public void add(Course course) throws Exception {
		if (course.getCourseName().equals(course.getCourseName()) && course.getPrice() <= 0) {
			throw new Exception("Kurs ismi tekrar edemez ve fiyatı 0'dan küçük olamaz. " + course.getCourseName());
		}

		courseDao.add(course);
	}
}
