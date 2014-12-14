package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IOrderRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.OrderEntity;
import org.wproject.server.utils.service.interfaces.IOrderService;

@Named
public class OrderService extends AbstractGenericService<OrderEntity, Long> implements IOrderService {

	@Inject
	private IOrderRepository orderRepository;

	@Override
	protected JpaRepository<OrderEntity, Long> getGenericRepository() {
		return this.orderRepository;
	}

}
