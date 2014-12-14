package org.wproject.server.database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wproject.server.utils.entities.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {

	public List<CategoryEntity> findByCategoryName(String categoryName);

}
