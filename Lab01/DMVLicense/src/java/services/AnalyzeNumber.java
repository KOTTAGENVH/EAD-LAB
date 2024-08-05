
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package services;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ejb.EJB;
import beans.PlateNumberManager;
import jakarta.ws.rs.FormParam;


/**
 * REST Web Service
 *
 * @author nowenkottage
 */
@Path("scanplate")
public class AnalyzeNumber {

    @EJB
    PlateNumberManager pnm;

    /**
     * Creates a new instance of AnalyzeNumber
     */
    public AnalyzeNumber() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String getCategoryPost(@FormParam("regnum") String registration) {
        return "<h2>Required Driving License Category: " + pnm.getDLCategory(registration) + "</h2>";
    }

    @GET
    @Path("getcategory")
    @Produces(MediaType.TEXT_HTML)
    public String getCategoryParams(@QueryParam("regnum") @DefaultValue("CBE1234") String registration) {
        return "<h2>Required Driving License Category: " + pnm.getDLCategory(registration) + "</h2>";
    }

    /**
     * Retrieves representation of an instance of services.AnalyzeNumber
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        // TODO: return proper representation object
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * PUT method for updating or creating an instance of AnalyzeNumber
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
        // TODO: implement the method
    }
}
