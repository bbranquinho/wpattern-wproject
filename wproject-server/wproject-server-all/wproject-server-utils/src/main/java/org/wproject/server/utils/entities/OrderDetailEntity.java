package org.wproject.server.utils.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;
import org.wproject.server.utils.entities.keys.OrderDetailKeyEntity;

@Entity
@XmlRootElement
@Table(name="\"Order Details\"")
public class OrderDetailEntity extends BaseEntity<OrderDetailKeyEntity> {

	private static final long serialVersionUID = 4145513888438234634L;

	private BigDecimal unitPrice;

	private Integer quantity;

	private Float discount;

	public OrderDetailEntity() {
	}

	public OrderDetailEntity(BigDecimal unitPrice, Integer quantity, Float discount) {
		super();
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.discount = discount;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}
