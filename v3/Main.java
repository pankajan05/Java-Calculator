/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company.v3;

import com.company.v3.Repository.FileNumberRepository;
import com.company.v3.Repository.NumberRepository;
import com.company.v3.input.CMDLineInput;
import com.company.v3.input.Inputs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inFile = null;

        Inputs input = new CMDLineInput(args);
        String operation = input.read();

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


       Calculator cal = new Calculator(inputNumbers.get(0),inputNumbers.get(1));

        switch(operation){
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
