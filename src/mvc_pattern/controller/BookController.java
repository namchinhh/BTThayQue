/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.controller;

import mvc_pattern.model.Book;
import mvc_pattern.view.BookView;

/**
 *
 * @author Kieu Viet Quan
 */
public class BookController {
    private Book model;
    private BookView view;

    public BookController() {
    }

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookSpecies(String species){
        model.setName(species);
    }
    public String getBookSpecies(){
        return model.getName();
    }
    public void setBookPrice(int price){
        model.setPrice(0);
    }
    public int getBookPrice(){
        return model.getPrice();
    }
     public void setBookAuthor(String author){
        model.setName(author);
    }
    public String getBookAuthor(){
        return model.getAuthor();
    }
   
   public void updateView(){
       view.printBookDetails(model.getName(), model.getAuthor(), model.getPrice());
   }
    
}
