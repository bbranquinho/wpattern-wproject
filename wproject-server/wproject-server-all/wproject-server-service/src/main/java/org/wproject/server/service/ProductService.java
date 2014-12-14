package org.wproject.server.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.IProductRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.ProductEntity;
import org.wproject.server.utils.service.interfaces.IProductService;

@Named
public class ProductService extends AbstractGenericService<ProductEntity, Long> implements IProductService {

	@Inject
	private IProductRepository productRepository;

	@Override
	protected JpaRepository<ProductEntity, Long> getGenericRepository() {
		return this.productRepository;
	}

}
