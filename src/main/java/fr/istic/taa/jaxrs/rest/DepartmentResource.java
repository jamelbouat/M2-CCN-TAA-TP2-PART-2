package fr.istic.taa.jaxrs.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.dto.DepartmentDto;
import fr.istic.taa.jaxrs.services.DepartmentService;

@Path("/department")
@Produces({"application/json", "application/xml"})
public class DepartmentResource {

	private DepartmentService departmentService = new DepartmentService();
	
	@GET
	@Path("/{departmentId}")
	public DepartmentDto getDepartmentById(@PathParam("departmentId") Long departmentId) {
		
		return departmentService.getDepartment(departmentId);
	}
	
	@POST
	@Consumes("application/json")
	public Response addDepartment(DepartmentDto departmentDto) {
		departmentService.createDepartment(departmentDto);
		
		return Response.ok().entity("SUCCESS").build();
	}
	
	@PUT
	@Consumes("application/json")
	public DepartmentDto updateDepartment(DepartmentDto departmentDto) {
		
		return departmentService.updateDepartment(departmentDto);
	}
	
	@DELETE
	@Path("/{departmentId}")
	public Response deleteDepartment(@PathParam("departmentId") Long departmentId) {
		departmentService.deleteDepartment(departmentId);
		
		return Response.ok().entity("SUCCESS").build();
	}
 
}
