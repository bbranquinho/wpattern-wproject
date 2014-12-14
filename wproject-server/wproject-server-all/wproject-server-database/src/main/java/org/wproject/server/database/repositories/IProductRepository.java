package org.wproject.server.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.utils.entities.ProductEntity;

public interface IProductRepository extends JpaRepository<ProductEntity, Long> {

}
