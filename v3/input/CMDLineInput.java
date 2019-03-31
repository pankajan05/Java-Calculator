package com.company.v3.input;

import com.company.v3.input.Inputs;

public class CMDLineInput implements Inputs {

    private String args[];

    public CMDLineInput(String args[]){
        this.args = args;
    }


    @Override
    public String read() {
       /* String operation = args[0];//read the first argument
        return operation;*/

        return args[0];   //read and return the first argument
    }
}
