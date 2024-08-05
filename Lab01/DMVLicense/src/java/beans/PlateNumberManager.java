
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package beans;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author nowenkottage
 */
@Stateless
public class PlateNumberManager {
    public String getDLCategory(String regnum) {
        String dlcategory = "Unknown Licence Category";
        switch (Character.toUpperCase(regnum.charAt(0))) {
            case 'C':
            case 'K':
            case 'P':
            case 'D':
                dlcategory = "Light Vehicle";
                break;
            case 'L':
            case 'N':
                dlcategory = "Heavy Vehicle";
                break;
            case 'M':
            case 'B':
                dlcategory = "Motor Bicycle";
                break;
            case 'Y':
            case 'A':
                dlcategory = "Three Wheeler";
                break;
        }
        return dlcategory;
    }
}
