/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_pattern;

/**
 *
 * @author Nguyen Thanh Nam
 */
public class ProductFactory {
    public Product getProduct(String productType){
        if(productType==null)
            return null;
        if(productType.equalsIgnoreCase("BOOK"))
            return new Book();
        else if(productType.equalsIgnoreCase("Electronic"))
            return new Electronic();
        else if(productType.equalsIgnoreCase("Clothe"))
            return new Clothe();
        return null;
    }
}
