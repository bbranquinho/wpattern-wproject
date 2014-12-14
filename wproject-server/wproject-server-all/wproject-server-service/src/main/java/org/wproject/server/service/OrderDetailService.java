package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IOrderDetailRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.OrderDetailEntity;
import org.wproject.server.utils.entities.keys.OrderDetailKeyEntity;
import org.wproject.server.utils.service.interfaces.IOrderDetailService;

@Named
public class OrderDetailService extends AbstractGenericService<OrderDetailEntity, OrderDetailKeyEntity> implements IOrderDetailService {

	@Inject
	private IOrderDetailRepository orderDetailRepository;

	@Override
	protected JpaRepository<OrderDetailEntity, OrderDetailKeyEntity> getGenericRepository() {
		return this.orderDetailRepository;
	}

}
