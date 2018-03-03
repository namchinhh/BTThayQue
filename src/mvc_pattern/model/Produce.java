/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.model;

/**
 *
 * @author Kieu Viet Quan
 */
public class Produce {
    protected String species;
    protected int price;

    public Produce() {
    }

    public Produce(String name, int price) {
        this.species = name;
        this.price = price;
    }

    public String getName() {
        return species;
    }

    public void setName(String name) {
        this.species = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
