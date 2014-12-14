package org.wproject.server.test.database.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.wproject.server.database.repositories.ICategoryRepository;
import org.wproject.server.test.database.AbstractDatabaseTest;
import org.wproject.server.utils.entities.CategoryEntity;

public class CategoryRepositoryTest extends AbstractDatabaseTest {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private ICategoryRepository categoryRepository;

	@Test
	public void testCategoryRepository() {
		List<CategoryEntity> categories = this.categoryRepository.findAll();

		this.logger.debug(categories);
	}

}
