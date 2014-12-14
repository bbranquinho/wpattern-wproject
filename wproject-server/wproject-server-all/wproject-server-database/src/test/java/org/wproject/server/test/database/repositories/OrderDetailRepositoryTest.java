package org.wproject.server.test.database.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.wproject.server.database.repositories.IOrderDetailRepository;
import org.wproject.server.test.database.AbstractDatabaseTest;
import org.wproject.server.utils.entities.OrderDetailEntity;

public class OrderDetailRepositoryTest extends AbstractDatabaseTest {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IOrderDetailRepository OrderDetailRepository;

	@Test
	public void testOrderDetailRepository() {
		List<OrderDetailEntity> categories = this.OrderDetailRepository.findAll();

		this.logger.debug(categories);
	}

}
