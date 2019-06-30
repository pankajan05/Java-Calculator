package com.company.v6.output;

public class ConsoleOutput implements Outputs {
    @Override
    public void show(String text) {
        System.out.println(text);
    }
}
//factory design pattern