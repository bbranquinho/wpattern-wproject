package org.wproject.server.service;


import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.database.repositories.ICategoryRepository;
import org.wproject.server.service.utils.AbstractGenericService;
import org.wproject.server.utils.entities.CategoryEntity;
import org.wproject.server.utils.service.interfaces.ICategoryService;

@Named
public class CategoryService extends AbstractGenericService<CategoryEntity, Long> implements ICategoryService {

	@Inject
	private ICategoryRepository categoryRepository;

	@Override
	protected JpaRepository<CategoryEntity, Long> getGenericRepository() {
		return this.categoryRepository;
	}

	@Override
	public CategoryEntity findOne(Long pk) {
		return this.categoryRepository.findOne(pk);
	}

	@Override
	public List<CategoryEntity> findByCategoryName(String categoryName) {
		return this.categoryRepository.findByCategoryName(categoryName);
	}

	@Override
	public int countByCategoryName(@PathParam("category_name") String categoryName) {
		return this.categoryRepository.findByCategoryName(categoryName).size();
	}


}
