package com.company.v8.factory;

import com.company.v8.operation.*;

import java.util.List;

public class ObjectOperationFactory implements Factory {
    private final String str;
    private final List<Double> inputNumbers;

    public ObjectOperationFactory(List<Double> inputNumbers, String str) {
        this.inputNumbers = inputNumbers;
        this.str = str;
    }

    @Override
    public Operation getInstance() {
        Operation operation = null;
        switch(str){
            case "add":
                operation = new Addoperation(inputNumbers.get(0),inputNumbers.get(1));
            break;
            case "sub":
                operation =  new SubOperation(inputNumbers.get(0),inputNumbers.get(1));
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
        return operation;
    }
}
