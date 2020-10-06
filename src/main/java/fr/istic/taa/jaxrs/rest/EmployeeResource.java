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

import fr.istic.taa.jaxrs.dto.EmployeeDto;
import fr.istic.taa.jaxrs.services.EmployeeService;

@Path("/employee")
@Produces({"application/json", "application/xml"})
public class EmployeeResource {

	private EmployeeService employeeService = new EmployeeService();
	
	@GET
	@Path("/{employeeId}")
	public EmployeeDto getEmployeeById(@PathParam("employeeId") Long employeeId) {
		
		return employeeService.getEmployee(employeeId);
	}
	
	@POST
	@Consumes("application/json")
	public Response addEmployee(EmployeeDto employeeDto) {
		employeeService.createEmployee(employeeDto);
		
		return Response.ok().entity("SUCCESS").build();
	}
	
	@PUT
	@Consumes("application/json")
	public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
		
		return employeeService.updateEmployee(employeeDto);
	}
	
	@DELETE
	@Path("/{employeeId}")
	public Response deleteEmployee(@PathParam("employeeId") Long employeeId) {
		employeeService.deleteEmployee(employeeId);
		
		return Response.ok().entity("SUCCESS").build();
	}
 
}
