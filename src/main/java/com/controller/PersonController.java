package com.controller;

import com.model.Person;
import com.service.PersonService;
import com.service.PersonServiceImpl;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/database-operation")
public class PersonController {

   private PersonService personService=new PersonServiceImpl();

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Person person)
    {
        personService.add(person);
       return Response.status(201).build();

    }
    @GET
    @Path("/findById")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response findById(@QueryParam("id") int id)
    {
        Person person = personService.findById(id);
        return Response.status(201).entity(person.toString()).build();

    }
    @GET
    @Path("/findAll")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response findByAll()
    {
       List<Person> person =  personService.findAll();
        return Response.status(201).entity(person.toString()).build();

    }
    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Person person)
    {
        Person person1 =personService.update(person);
        return Response.status(201).entity(person.toString()).build();

    }
    @POST
    @Path("/remove")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response remove(Person person)
    {
        personService.remove(person);
        return Response.status(201).build();

    }
    @GET
    @Path("/removeById")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response removeById(@QueryParam("id") int id)
    {
        personService.removeById(id);
        return Response.status(201).build();

    }


}
