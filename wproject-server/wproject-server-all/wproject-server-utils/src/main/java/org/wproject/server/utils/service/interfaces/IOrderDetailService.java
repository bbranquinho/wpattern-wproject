package org.wproject.server.utils.service.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.wproject.server.utils.entities.OrderDetailEntity;
import org.wproject.server.utils.entities.keys.OrderDetailKeyEntity;
import org.wproject.server.utils.service.ServiceConstants;
import org.wproject.server.utils.service.ServiceName;

@Path(value = ServiceName.ORDER_DETAIL_SERVICE)
@Produces(ServiceConstants.MEDIA_TYPE)
@Consumes(ServiceConstants.MEDIA_TYPE)
public interface IOrderDetailService extends IGenericService<OrderDetailEntity, OrderDetailKeyEntity> {

}
