package com.company.v7.factory;

import com.company.v7.operation.Addoperation;
import com.company.v7.operation.Divoperation;
import com.company.v7.operation.Muloperation;
import com.company.v7.operation.SubOperation;

import java.util.List;

public class OperationFactory implements Factory {
    private final String str;
    private final List<Double> inputNumbers;

    public OperationFactory(List<Double> inputNumbers, String str) {
        this.inputNumbers = inputNumbers;
        this.str = str;
    }

    @Override
    public Object getInstance() {
        Object object = null;
        switch(str){
            case "add":
                object = new Addoperation(inputNumbers.get(0),inputNumbers.get(1));
            break;
            case "sub":
                object =  new SubOperation(inputNumbers.get(0),inputNumbers.get(1));
            break;
            case "mul":
                object = new Muloperation(inputNumbers.get(0),inputNumbers.get(1));
            break;
            case "div":
                object = new Divoperation(inputNumbers.get(0),inputNumbers.get(1));
            break;
            default:
                System.out.println("Sorry that is not a function of this calculator");
        }
        return object;
    }
}
