/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riemannsum;

/**
 *
 * @author Acer
 */
public class RiemannSum {

    static Choice Gui;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (Gui == null) {
            Gui = new Choice();
            Gui.setVisible(true);
        }

    }

}
