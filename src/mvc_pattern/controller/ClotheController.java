/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.controller;

import mvc_pattern.model.Clothe;
import mvc_pattern.view.ClotheView;

/**
 *
 * @author Kieu Viet Quan
 */
public class ClotheController {
    private Clothe model;
    private ClotheView view;

    public ClotheController() {
    }

    public ClotheController(Clothe model, ClotheView view) {
        this.model = model;
        this.view = view;
    }
    public void setClotheSpecies(String species){
        model.setName(species);
    }
    public String getClotheSpecies(){
        return model.getName();
    }
     public void setClotheSize(int  size){
        model.setSize(size);
    }
    public int getClotheSize(){
        return model.getSize();
    }
     public void setClothePrice(int price){
        model.setPrice(price);
    }
    public int getClothePrice(){
        return model.getPrice();
    }
    public void updateView(){
        view.printClotheDetails(model.getName(), model.getSize(), model.getPrice());
    }
}
