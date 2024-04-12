/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package riemannsum;

/**
 *
 * @author Acer
 */
public class Computation {

    double perform(double UpperLimit, double LowerLimit, double Nrectangle) {
        double Dx = (UpperLimit - LowerLimit) / Nrectangle;
        return Dx;
    }

    double perform2(double myDx, double xcube, double xsquare, double Justx, double Constant, double UpperLimit, double LowerLimit) {

        double sum = 0.0;

        for (double i = LowerLimit; i < UpperLimit; i += myDx) {
            double Cube = myDx * (xcube * Math.pow(i, 3));
            double Squared = myDx * (xsquare * Math.pow(i, 2));
            double x = myDx * (Justx * Math.pow(i, 1));
            double C = Constant;

            sum += Cube + Squared + x + C;
        }

        return sum;
    }

    double perform3(double ValueA, double delta, double Fourth, double Cube, double Square, double Justa, double Constant) {

        double Forfourth = Fourth * (Math.pow((ValueA + delta), 4));
        double Forcube = Cube * (Math.pow((ValueA + delta), 3));
        double Forsquare = Square * (Math.pow((ValueA + delta), 2));
        double Forjusta = Justa * (ValueA + delta);
        double Forconstant = Constant;

        double sum = Forfourth + Forcube + Forsquare + Forjusta + Forconstant;

        return sum;
    }

    double perform4(double ValueA, double delta, double Fourth, double Cube, double Square, double Justa, double Constant) {

        double Forfourth = Fourth * (Math.pow(ValueA, 4));
        double Forcube = Cube * (Math.pow(ValueA, 3));
        double Forsquare = Square * (Math.pow(ValueA, 2));
        double Forjusta = Justa * (ValueA);
        double Forconstant = Constant;

        double Sum = Forfourth + Forcube + Forsquare + Forjusta + Forconstant;

        return Sum;
    }

    double perform5(double ValueA, double delta, double Fourth, double Cube, double Square, double Justa, double Constant) {

        double result = ((perform3(ValueA, delta, Fourth, Cube, Square, Justa, Constant)) - (perform4(ValueA, delta, Fourth, Cube, Square, Justa, Constant)))/delta;

        return result;
    }
}
