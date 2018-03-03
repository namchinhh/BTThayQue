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
public class ElectronicView {
    public void printElectronicDetails(String species, String trademark, int price){
        System.out.println("Electronic: ");
        System.out.println("Species: "+species);
        System.out.println("Trademark: "+trademark);
        System.out.println("Price: "+price);
    }
}
