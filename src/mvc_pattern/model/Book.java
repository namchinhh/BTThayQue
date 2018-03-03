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
public class Book extends Produce{
    private String Author;

    public Book() {
    }

    public Book(String Author, String species, int price) {
        super(species, price);
        this.Author = Author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    
    
}
