package org.wproject.server.utils.entities.keys;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseKey;

@XmlRootElement
@Embeddable
public class OrderDetailKeyEntity extends BaseKey {

	private static final long serialVersionUID = -2817881230971112397L;

	private Long orderId;

	private Long productId;

	public OrderDetailKeyEntity() {
	}

	public OrderDetailKeyEntity(Long orderId, Long productId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((this.orderId == null) ? 0 : this.orderId.hashCode());
		result = prime * result	+ ((this.productId == null) ? 0 : this.productId.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!super.equals(obj)) {
			return false;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		OrderDetailKeyEntity other = (OrderDetailKeyEntity) obj;

		if (this.orderId == null) {
			if (other.orderId != null) {
				return false;
			}
		} else if (!this.orderId.equals(other.orderId)) {
			return false;
		}

		if (this.productId == null) {
			if (other.productId != null) {
				return false;
			}
		} else if (!this.productId.equals(other.productId)) {
			return false;
		}

		return true;
	}

}
