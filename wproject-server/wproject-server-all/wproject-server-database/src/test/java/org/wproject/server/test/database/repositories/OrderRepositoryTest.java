package org.wproject.server.test.database.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.wproject.server.database.repositories.IOrderRepository;
import org.wproject.server.test.database.AbstractDatabaseTest;
import org.wproject.server.utils.entities.OrderEntity;

public class OrderRepositoryTest extends AbstractDatabaseTest {

	private final Logger logger = Logger.getLogger(this.getClass());

	@Inject
	private IOrderRepository OrderRepository;

	@Test
	public void testOrderRepository() {
		List<OrderEntity> categories = this.OrderRepository.findAll();

		this.logger.debug(categories);
	}

}
