package com.company.v5.output;

public class ConsoleOutput implements Outputs {
    @Override
    public void show(String text) {
        System.out.println(text);
    }
}
//factory design pattern