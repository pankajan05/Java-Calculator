/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company.v6;


import com.company.v6.Repository.FileNumberRepository;
import com.company.v6.Repository.NumberRepository;
import com.company.v6.factory.Factory;
import com.company.v6.factory.ObjectOperationFactory;
import com.company.v6.input.CMDLineInput;
import com.company.v6.input.Inputs;
import com.company.v6.operation.*;
import com.company.v6.output.ConsoleOutput;
import com.company.v6.output.Outputs;

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

        Factory factoryobject = new ObjectOperationFactory(inputNumbers,operator);
        operation = (Operation) factoryobject.getInstance();

        Outputs output = new ConsoleOutput();
        output.show("Answer for "+operator+" is: "+ operation.perform());

    }
}
