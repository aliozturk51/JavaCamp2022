package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {
		
		if(instructor.getAge()<18) {
			throw new Exception("Kurallar gereği 18 yaşından küçükler eğitim verememektedir.");
		}
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
		}

	}

}
