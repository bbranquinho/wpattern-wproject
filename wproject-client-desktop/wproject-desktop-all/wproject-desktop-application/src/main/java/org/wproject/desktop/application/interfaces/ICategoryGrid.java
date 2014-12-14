package org.wproject.desktop.application.interfaces;

import java.util.List;

import org.wproject.server.utils.entities.CategoryEntity;
import org.wproject.server.utils.service.interfaces.ICategoryService;

public interface ICategoryGrid {

	public void addCategories(List<CategoryEntity> categories);

	public ICategoryService getService();

}
