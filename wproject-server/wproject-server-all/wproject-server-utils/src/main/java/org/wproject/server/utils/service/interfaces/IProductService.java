package org.wproject.server.utils.service.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.wproject.server.utils.entities.ProductEntity;
import org.wproject.server.utils.service.ServiceConstants;
import org.wproject.server.utils.service.ServiceName;

@Path(value = ServiceName.PRODUCT_SERVICE)
@Produces(ServiceConstants.MEDIA_TYPE)
@Consumes(ServiceConstants.MEDIA_TYPE)
public interface IProductService extends IGenericService<ProductEntity, Long> {

}
