/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.Set;

/**
 * Application configuration for JAX-RS.
 */
@ApplicationPath("/webresources")  // Base URI for REST API
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
       resources.add(AnalyzeNumber.class);
        return resources;
    }

    /**
     * Method to add resource classes to the set.
     * Modify this method to include your resource classes.
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        // Add your resource classes here
        resources.add(services.AnalyzeNumber.class);  // Example resource
    }
}
