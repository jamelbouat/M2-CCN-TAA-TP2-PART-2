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

import fr.istic.taa.jaxrs.dto.CardDto;
import fr.istic.taa.jaxrs.services.CardService;

@Path("/card")
@Produces({"application/json", "application/xml"})
public class CardResource {

	private CardService cardService = new CardService();
	
	@GET
	@Path("/{cardId}")
	public CardDto getCardById(@PathParam("cardId") Long cardId) {
		
		return cardService.getCard(cardId);
	}
	
	@POST
	@Consumes("application/json")
	public Response addCard(CardDto cardDto) {
		cardService.createCard(cardDto);
		
		return Response.ok().entity("SUCCESS").build();
	}
	
	@PUT
	@Consumes("application/json")
	public CardDto updateCard(CardDto cardDto) {
		
		return cardService.updateCard(cardDto);
	}
	
	@DELETE
	@Path("/{cardId}")
	public Response deleteCard(@PathParam("cardId") Long cardId) {
		cardService.deleteCard(cardId);
		
		return Response.ok().entity("SUCCESS").build();
	}
 
}
