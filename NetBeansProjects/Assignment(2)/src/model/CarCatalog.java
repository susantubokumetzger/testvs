/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author susan
 */
public class CarCatalog {
     private List<Cars> CarCatalog;
    
     public CarCatalog() {
        CarCatalog = new ArrayList<Cars>();
    }
     
     public List<Cars> getCarcatalog() {
        return CarCatalog;
    }
     
     public Cars addCars() {
        Cars c = new Cars();
        CarCatalog.add(c);
        return c;
    }
     
     public Cars updateCars() {
        Cars c = new Cars();
        CarCatalog.add(c);
        return c;
    }
     
     public Cars searchCars(int serialnumber) {
        for (Cars car : CarCatalog) {
            if (car.getSerialnumber() == serialnumber) {
                return car;
            }
        }
        return null;
}
     
     
}