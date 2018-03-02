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
public class ProductFactoryPattern {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        
        Product product1 = productFactory.getProduct("book");
        product1.show();
        Product product2 = productFactory.getProduct("electronic");
        product2.show();
        Product product3 = productFactory.getProduct("clothe");
        product3.show();
    }
}
