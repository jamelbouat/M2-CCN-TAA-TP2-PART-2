package fr.istic.taa.jaxrs.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import fr.istic.taa.jaxrs.dto.PetDto;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.models.tags.Tag;

@Path("/pet")
@Produces({"application/json", "application/xml"})
public class PetResource {

  @GET
  @Path("/{petId}")
  public PetDto getPetById(@PathParam("petId") Long petId)  {
      // return pet
	  PetDto pet = new PetDto();
	  pet.setId(petId);
	  pet.setName("dog");
	  Tag tag = new Tag();
	  tag.setDescription("middle aged dog");
	  List<Tag> tags = new ArrayList<Tag>();
	  tags.add(tag);
	  pet.setTags(tags);
	  
      return pet;
  }

  @POST
  @Consumes("application/json")
  public PetDto addPet(@Parameter(description = "Pet object that needs to be added to the store", required = true) PetDto pet) {
	  
	  pet.setName("cat");
	  pet.setId(1111l);
	  
	  return pet;
	  
//    return Response.ok().entity("SUCCESS").build();
  }
}