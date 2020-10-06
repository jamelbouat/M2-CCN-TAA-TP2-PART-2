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

import fr.istic.taa.jaxrs.dto.KanbanDto;
import fr.istic.taa.jaxrs.services.KanbanService;

@Path("/kanban")
@Produces({"application/json", "application/xml"})
public class KanbanResource {

	private KanbanService kanbanService = new KanbanService();
	
	@GET
	@Path("/{kanbanId}")
	public KanbanDto getKanbanById(@PathParam("kanbanId") Long kanbanId) {
		
		return kanbanService.getKanban(kanbanId);
	}
	
	@POST
	@Consumes("application/json")
	public Response addKanban(KanbanDto kanbanDto) {
		kanbanService.createKanban(kanbanDto);
		
		return Response.ok().entity("SUCCESS").build();
	}
	
	@PUT
	@Consumes("application/json")
	public KanbanDto updateKanban(KanbanDto kanbanDto) {
		
		return kanbanService.updateKanban(kanbanDto);
	}
	
	@DELETE
	@Path("/{kanbanId}")
	public Response deleteKanban(@PathParam("kanbanId") Long kanbanId) {
		kanbanService.deleteKanban(kanbanId);
		
		return Response.ok().entity("SUCCESS").build();
	}
 
}
