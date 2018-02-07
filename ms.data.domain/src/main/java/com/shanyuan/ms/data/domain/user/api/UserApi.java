package com.shanyuan.ms.data.domain.user.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shanyuan.ms.data.domain.DALException;
import com.shanyuan.ms.data.domain.user.MemberInfo;
@Path("user")
public interface UserApi {

	@GET
    @Path("{id : \\d+}")
    @Produces({MediaType.APPLICATION_JSON})
	public MemberInfo getMember(@PathParam("id")Integer memberId) throws DALException ;
}
