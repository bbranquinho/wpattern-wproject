package org.wproject.server.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.utils.entities.OrderEntity;

public interface IOrderRepository extends JpaRepository<OrderEntity, Long> {

}
