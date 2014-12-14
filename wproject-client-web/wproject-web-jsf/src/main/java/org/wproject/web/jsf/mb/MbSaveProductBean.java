package org.wproject.web.jsf.mb;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;
import org.wproject.server.utils.entities.ProductEntity;
import org.wproject.server.utils.service.interfaces.IProductService;
import org.wproject.web.jsf.utils.BaseBean;


//ConfigurableBeanFactory.SCOPE_SINGLETON, ConfigurableBeanFactory.SCOPE_PROTOTYPE,
//WebApplicationContext.SCOPE_REQUEST, WebApplicationContext.SCOPE_SESSION
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
@Named(value = "mbSaveProduct")
public class MbSaveProductBean extends BaseBean {

	private static final long serialVersionUID = 201311132355L;

	@Inject
	private IProductService productService;

	@Inject
	private MbProductBean mbProductBean;

	private ProductEntity product;
	
	private String title;

	public MbSaveProductBean() {
		this.product = new ProductEntity();
	}

	public ProductEntity getProduct() {
		return this.product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	public void add() {
		this.title = "Add";
	}

	public void update() {
		this.product = this.mbProductBean.getSelectedProduct();
		this.title = "Update";
	}

	public void save() {
		if (this.product != null) {
			if (this.product.getId() == null) {
				// Add
				this.productService.insert(this.product);
			} else {
				// Update
				this.productService.update(this.product);
			}
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
