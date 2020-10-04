package fr.istic.taa.jaxrs.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import fr.istic.taa.jaxrs.domain.Pet;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.models.tags.Tag;

@Path("/pet")
@Produces({"application/json", "application/xml"})
public class PetResource {

  @GET
  @Path("/{petId}")
  public Pet getPetById(@PathParam("petId") Long petId)  {
      // return pet
	  Pet pet = new Pet();
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
  public Pet addPet(@Parameter(description = "Pet object that needs to be added to the store", required = true) Pet pet) {
	  
	  pet.setName("cat");
	  pet.setId(1111l);
	  
	  return pet;
	  
//    return Response.ok().entity("SUCCESS").build();
  }
}