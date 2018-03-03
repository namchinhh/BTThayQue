/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.Demo;

import mvc_pattern.controller.BookController;
import mvc_pattern.controller.ClotheController;
import mvc_pattern.controller.ElectronicController;
import mvc_pattern.model.Book;
import mvc_pattern.model.Clothe;
import mvc_pattern.model.Electronic;
import mvc_pattern.view.BookView;
import mvc_pattern.view.ClotheView;
import mvc_pattern.view.ElectronicView;

/**
 *
 * @author Kieu Viet Quan
 */
public class Main {
    
    public static void main(String[] args) {
        Book book = retriveBookFromDatabase();
        BookView bookView = new BookView();
        BookController bookController = new BookController(book, bookView);
        bookController.updateView();
        bookController.setBookSpecies("PHP");
        bookController.updateView();
        System.out.println("----------------");
        Clothe clothe = retriveClotheFromDatabase();
        ClotheView clotheView = new ClotheView();
        ClotheController  clotheController = new ClotheController(clothe, clotheView);
        clotheController.updateView();
        clotheController.setClothePrice(1000000);
        clotheController.updateView();
        System.out.println("----------------");
        Electronic electronic = retriveElectronicFromDatabase();
        ElectronicView electronicView = new ElectronicView();
        ElectronicController electronicController = new ElectronicController(electronic, electronicView);
        electronicController.updateView();
        electronicController.setElectronicPrice(40000000);
        electronicController.updateView();
    }
    private static Book retriveBookFromDatabase() {
        Book book = new Book();
        book.setName("Java");
        book.setAuthor("ABC");
        book.setPrice(45000);
        return book;
    }
    private static Clothe retriveClotheFromDatabase() {
        Clothe clothe = new Clothe();
        clothe.setName("Jean");
        clothe.setSize(32);
        clothe.setPrice(250000);
        return clothe;
    }
    private static Electronic retriveElectronicFromDatabase() {
        Electronic electronic = new Electronic();
        electronic.setName("Dien Lanh");
        electronic.setTrademark("Yamaha");
        electronic.setPrice(5000000);
        return electronic;
    }
}
