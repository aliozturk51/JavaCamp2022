package kodlamaIo.business;

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

		Category[] categories = { new Category(1, "Backend"), new Category(2, "Mobile") };
		for (Category ctgr : categories) {
			if (category.getCategoryName() == (ctgr.getCategoryName())) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
