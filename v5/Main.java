/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company.v5;


import com.company.v5.Repository.FileNumberRepository;
import com.company.v5.Repository.NumberRepository;
import com.company.v5.input.CMDLineInput;
import com.company.v5.input.Inputs;
import com.company.v5.operation.*;
import com.company.v5.output.ConsoleOutput;
import com.company.v5.output.Outputs;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inFile = null;

        Inputs input = new CMDLineInput(args);
        String operator = input.read();

        NumberRepository numberRepository = new FileNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


        Operation operation = null;

        switch(operator){
            case "add":
                operation = new Addoperation(inputNumbers.get(0),inputNumbers.get(1));
                break;
            case "sub":
                operation = new SubOperation(inputNumbers.get(0),inputNumbers.get(1));
               break;
               case "mul":
                   operation = new Muloperation(inputNumbers.get(0),inputNumbers.get(1));
                break;
            case "div":
                operation = new Divoperation(inputNumbers.get(0),inputNumbers.get(1));
                break;
            default:
                System.out.println("Sorry that is not a function of this calculator");
        }

        Outputs output = new ConsoleOutput();
        output.show("Answer for "+operator+" is: "+ operation.perform());

    }
}
