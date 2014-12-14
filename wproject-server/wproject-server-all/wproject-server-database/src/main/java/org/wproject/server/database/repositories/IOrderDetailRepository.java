package org.wproject.server.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.utils.entities.OrderDetailEntity;
import org.wproject.server.utils.entities.keys.OrderDetailKeyEntity;

public interface IOrderDetailRepository extends JpaRepository<OrderDetailEntity, OrderDetailKeyEntity> {

}
