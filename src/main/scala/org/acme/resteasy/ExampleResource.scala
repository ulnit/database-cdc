package org.acme.resteasy

import javax.ws.rs.{GET, Path, Produces}
import javax.ws.rs.core.MediaType

@Path("/resteasy/hello")
class ExampleResource {

    @GET
    @Produces(Array[String](MediaType.TEXT_PLAIN))
    def hello() = "hello"
}