package org.wproject.web.jsf.mb;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.wproject.server.utils.entities.ProductEntity;
import org.wproject.server.utils.service.interfaces.IProductService;
import org.wproject.web.jsf.utils.BaseBean;
import org.wproject.web.jsf.utils.ObjectParser;

// ConfigurableBeanFactory.SCOPE_SINGLETON, ConfigurableBeanFactory.SCOPE_PROTOTYPE,
// WebApplicationContext.SCOPE_REQUEST, WebApplicationContext.SCOPE_SESSION
@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "mbProduct")
public class MbProductBean extends BaseBean {

	private static final long serialVersionUID = 201311110213L;

	private static final Logger logger = Logger.getLogger(MbProductBean.class);

	@Inject
	private IProductService productService;

	private List<ProductEntity> products;

	private ProductEntity selectedProduct;

	private Long id;

	public MbProductBean() {
	}

	public void delete() {
		if (this.selectedProduct != null) {
			this.productService.delete(this.selectedProduct.getId());
		}
	}

	public void onLoad() {
		this.products = this.productService.findAll();
	}

	public List<ProductEntity> getProducts() {
		return this.products;
	}

	public void selectProduct(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.selectedProduct = ObjectParser.JSON_MAPPER.convertValue(
						evt.getObject(), ProductEntity.class);
			} else {
				this.selectedProduct = null;
			}
		} catch (Exception e) {
			this.selectedProduct = null;

			logger.error(e.getMessage(), e);
		}
	}

	public void unselectProduct() {
		this.selectedProduct = null;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductEntity getSelectedProduct() {
		return this.selectedProduct;
	}

	public void setSelectedProduct(ProductEntity selectedProduct) {
		this.selectedProduct = selectedProduct;
	}

}
