package org.wproject.server.test.database.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.wproject.server.database.repositories.IProductRepository;
import org.wproject.server.test.database.AbstractDatabaseTest;
import org.wproject.server.utils.entities.ProductEntity;

public class ProductRepositoryTest extends AbstractDatabaseTest {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IProductRepository productRepository;

	@Test
	public void testProductRepository() {
		List<ProductEntity> products = this.productRepository.findAll();

		this.logger.debug(products);
	}

}
