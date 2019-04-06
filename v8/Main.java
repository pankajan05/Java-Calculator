/*Authors: Pankajan(SE/2016/032)
            Dinindu(SE/2016/033)
             Hashika(SE/2016/012)
             Udith(SE/2016/047)
   Purpose: Assignment of Software Construction
   Function : read two numbers from the file and do calculation
 */

package com.company.v8;


import com.company.v8.Repository.DatabaseNumberRepository;
import com.company.v8.Repository.FileNumberRepository;
import com.company.v8.Repository.NumberRepository;
import com.company.v8.factory.Factory;
import com.company.v8.factory.ObjectOperationFactory;
import com.company.v8.input.CMDLineInput;
import com.company.v8.input.Inputs;
import com.company.v8.operation.Operation;
import com.company.v8.output.ConsoleOutput;
import com.company.v8.output.GuiOutput;
import com.company.v8.output.Outputs;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inFile = null;

        Inputs input = new CMDLineInput(args);
        String operator = input.read();

        NumberRepository numberRepository = new DatabaseNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


        Operation operation = null;

        Factory factoryobject = new ObjectOperationFactory(inputNumbers,operator);
        operation = factoryobject.getInstance();

        Outputs output = new GuiOutput();
        output.show("Answer for "+operator+" is: "+ operation.perform());

    }
}
