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
public class Electronic extends Produce{
    private String trademark;

    public Electronic() {
    }

    public Electronic(String trademark, String species, int price) {
        super(species, price);
        this.trademark = trademark;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
    
}
