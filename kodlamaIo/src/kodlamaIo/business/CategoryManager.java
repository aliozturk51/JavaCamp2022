package kodlamaIo.business;

import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
 
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		if (category.getCategoryName() ==(category.getCategoryName())) {
			throw new Exception("Kategori ismi tekrar edemez." + category.getCategoryName());
		}

		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
