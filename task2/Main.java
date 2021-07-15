package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        int i = 0;
        float [][] pointOfPolygon = new float[4][2];
        ArrayList<Integer> outputData = new ArrayList<>();
        Task test = new Task();
        File file1 = new File(args[0]);
        File file2 = new File(args[1]);
        Scanner scanner = new Scanner(file1);

        while (scanner.hasNextLine()) {
            String [] temp = scanner.nextLine().split(" ");
            pointOfPolygon[i][0] = Float.parseFloat(temp[0]);
            pointOfPolygon[i][1] = Float.parseFloat(temp[1]);
            i++;
        }
        scanner.close();

        scanner = new Scanner(file2);
        while (scanner.hasNextLine()) {
            String[] temp = scanner.nextLine().split(" ");
            float x = Float.parseFloat(temp[0]);
            float y = Float.parseFloat(temp[1]);
            outputData.add(test.task(pointOfPolygon, x, y));
        }
        scanner.close();
        for (int outData : outputData) {
            System.out.println(outData);
        }
    }
}
