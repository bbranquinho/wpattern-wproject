package org.wproject.desktop.application.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.wproject.desktop.application.enums.ButtonTypeEnum;
import org.wproject.desktop.application.interfaces.ICategoryData;
import org.wproject.desktop.application.interfaces.ICategoryGrid;
import org.wproject.server.utils.entities.CategoryEntity;


public class CategoryButton extends JButton {

	private static final long serialVersionUID = -7431880216186965304L;

	private Logger logger = Logger.getLogger(this.getClass());

	private final ButtonTypeEnum typeButton;
	private final ICategoryGrid categoryGrid;
	private final ICategoryData categoryData;

	public CategoryButton(ButtonTypeEnum typeButton, ICategoryGrid categoryGrid, ICategoryData categoryData) {
		super(typeButton.getText());

		this.typeButton = typeButton;
		this.categoryGrid = categoryGrid;
		this.categoryData = categoryData;

		this.loadActionListener();
	}

	private void loadActionListener() {

		switch (this.typeButton) {
		case DELETE:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						CategoryButton.this.categoryGrid.getService().delete(CategoryButton.this.categoryData.getCategoryId());

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, String.format("Impossible access the service [%s].", ex.getMessage()));
					}
				}
			});
			break;

		case FIND:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, String.format("Impossible access the service [%s].", ex.getMessage()));
					}
				}
			});
			break;

		case INSERT:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CategoryEntity category = new CategoryEntity();

					category.setCategoryName(CategoryButton.this.categoryData.getCategoryName());
					category.setDescription(CategoryButton.this.categoryData.getCategoryDescription());
					category.setPicture(CategoryButton.this.categoryData.getPicture());

					try{
						CategoryButton.this.categoryGrid.getService().insert(category);

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, String.format("Impossible access the service [%s].", ex.getMessage()));
					}
				}
			});
			break;

		case UPDATE:
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					CategoryEntity category = new CategoryEntity();

					category.setId(CategoryButton.this.categoryData.getCategoryId());
					category.setCategoryName(CategoryButton.this.categoryData.getCategoryName());
					category.setDescription(CategoryButton.this.categoryData.getCategoryDescription());
					category.setPicture(CategoryButton.this.categoryData.getPicture());

					if (CategoryButton.this.logger.isDebugEnabled()) {
						CategoryButton.this.logger.debug(String.format("Invoke service to update the category [%s].", category));
					}

					try {
						CategoryButton.this.categoryGrid.getService().update(category);

						CategoryButton.this.fillCategories();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(CategoryButton.this, String.format("Impossible access the service [%s].", ex.getMessage()));
					}
				}
			});
			break;
		}

	}

	private void fillCategories() {
		List<CategoryEntity> categories = this.categoryGrid.getService().findAll();

		this.categoryGrid.addCategories(categories);

		this.categoryData.clearFields();
	}

}
