package org.wproject.server.utils.service.interfaces;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import org.wproject.server.utils.BaseEntity;

public interface IGenericService<T extends BaseEntity<PK>, PK extends Serializable> {

	@GET
	public List<T> findAll();

	@POST
	public void insert(Object jsonEntityObject);

	@DELETE
	public void delete(Object jsonKeyObject);

	@PUT
	public void update(Object jsonEntityObject);

}
