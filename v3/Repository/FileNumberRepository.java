package com.company.v3.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
