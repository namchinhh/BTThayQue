/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.view;

/**
 *
 * @author Kieu Viet Quan
 */
public class BookView {
    public void printBookDetails(String bookName, String author, int price){
        System.out.println("Book: ");
        System.out.println("Name: "+bookName);
        System.out.println("Price: "+price);
    }
}
