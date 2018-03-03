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
public class ClotheView {
    public void printClotheDetails(String species, int size, int price){
        System.out.println("Clothe: ");
        System.out.println("Species: "+species);
        System.out.println("Size: "+size);
        System.out.println("Price: "+price);
    }
}
