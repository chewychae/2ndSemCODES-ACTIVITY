/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;

/**
 *
 * @author Acer
 */
public class cars {
    String Made;
    String Model;
    String Year; // attributes
    
    public cars (String Made, String Model, String Year){ //Constructor
    this.Made = Made;
    this.Model = Model;
    this.Year = Year;    
    
    }
     void printdetails(){
        System.out.println("This Car Made by: " + Made + "\nModel: " + Model + "\nYear: " + Year );
    }
}
