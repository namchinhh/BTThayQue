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
public class Clothe extends Produce{
    private int size;

    public Clothe() {
    }

    public Clothe(int size, String species, int price) {
        super(species, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
