/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company.v1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inFile = null;
        try {
            inFile = new Scanner(new FileReader("C:\\Users\\Pankajan\\IdeaProjects\\Software construction\\src\\com\\company\\numbers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        double A,B;

        A = inFile.nextDouble();
        B = inFile.nextDouble();

       Calculator cal = new Calculator(A,B);

        switch(args[0]){
            case "add":
                cal.add();
                break;
            case "sub":
               cal.sub();
               break;
               case "mul":
                cal.mul();
                break;
            case "div":
                cal.div();
                break;
            default:
                System.out.println("Sorry that is not a function of this calculator");


        }


    }
}
