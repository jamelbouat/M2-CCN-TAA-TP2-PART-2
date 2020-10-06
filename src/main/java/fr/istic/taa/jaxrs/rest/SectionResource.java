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

import fr.istic.taa.jaxrs.dto.SectionDto;
import fr.istic.taa.jaxrs.services.SectionService;

@Path("/section")
@Produces({"application/json", "application/xml"})
public class SectionResource {

	private SectionService sectionService = new SectionService();
	
	@GET
	@Path("/{sectionId}")
	public SectionDto getSectionById(@PathParam("sectionId") Long sectionId) {
		
		return sectionService.getSection(sectionId);
	}
	
	@POST
	@Consumes("application/json")
	public Response addSection(SectionDto sectionDto) {
		sectionService.createSection(sectionDto);
		
		return Response.ok().entity("SUCCESS").build();
	}
	
	@PUT
	@Consumes("application/json")
	public SectionDto updateSection(SectionDto sectionDto) {
		
		return sectionService.updateSection(sectionDto);
	}
	
	@DELETE
	@Path("/{sectionId}")
	public Response deleteSection(@PathParam("sectionId") Long sectionId) {
		sectionService.deleteSection(sectionId);
		
		return Response.ok().entity("SUCCESS").build();
	}
 
}
