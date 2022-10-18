package kodlamaIo.business;

import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public void add(Category category) throws Exception {

		if (category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Kategori ismi tekrar edemez." + category.getCategoryName());
		}

		categoryDao.add(category);

	}

}
