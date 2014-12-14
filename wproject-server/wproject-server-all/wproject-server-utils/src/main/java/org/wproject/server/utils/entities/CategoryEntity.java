package org.wproject.server.utils.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name = "Categories")
@AttributeOverride(name = "id", column = @Column(name = "CategoryID"))
public class CategoryEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -16240817663243274L;

	private String categoryName;

	private String description;

	private Byte[] picture;

	public CategoryEntity() {
	}

	public CategoryEntity(String categoryName, String description, Byte[] picture) {
		super();
		this.categoryName = categoryName;
		this.description = description;
		this.picture = picture;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(Byte[] picture) {
		this.picture = picture;
	}

}
