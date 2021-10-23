package com.indium;

import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@ApplicationScoped
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello RESTEasy Reactive");
    }

    @GET
    @Path("/multi")
    @Produces(MediaType.TEXT_PLAIN)
    public Multi<String> severalHello(){
        return Multi.createFrom().items("First String", "Second String");
    }
}