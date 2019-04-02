package com.company.v4.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileNumberRepository implements NumberRepository {


    @Override
    public List<Double> read() {

        List<Double> inputNumber = new ArrayList<>();
        List<String> inputNumberstr = null;

        Scanner inFile = null;

        try {
            inFile = new Scanner(new FileReader("C:\\Users\\Pankajan\\IdeaProjects\\Software construction\\src\\com\\company\\numbers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        for (int i = 0;i<2; i++) {
            inputNumber.add( inFile.nextDouble());
        }


        return inputNumber;
    }
}
