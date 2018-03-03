/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_pattern.controller;

import mvc_pattern.model.Electronic;
import mvc_pattern.view.ElectronicView;

/**
 *
 * @author Kieu Viet Quan
 */
public class ElectronicController {
    private Electronic model;
    private ElectronicView view;

    public ElectronicController() {
    }

    public ElectronicController(Electronic model, ElectronicView view) {
        this.model = model;
        this.view = view;
    }
    public void setElectronicSpecies(String species){
        model.setName(species);
    }
    public String getElectronicSpecies(){
        return model.getName();
    }
    public void setElectronicPrice(int  price){
        model.setPrice(price);
    }
    public int getElectronicPrice(){
        return model.getPrice();
    }
    public void setElectronicTrademark(String trademark){
        model.setTrademark(trademark);
    }
    public String getElectronicTrademark(){
        return model.getTrademark();
    }
    public void updateView(){
        view.printElectronicDetails(model.getName(), model.getTrademark(), model.getPrice());
    }
}
