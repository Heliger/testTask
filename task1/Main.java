package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        ArrayList<Integer> data = new ArrayList<>();

        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            data.add(Integer.parseInt(scanner.nextLine()));
        }
        scanner.close();

        Task1 test = new Task1();
        System.out.printf("%.2f\n", test.percentile(data));
        System.out.printf("%.2f\n", test.mediana(data));
        System.out.printf("%.2f\n", test.max(data));
        System.out.printf("%.2f\n", test.min(data));
        System.out.printf("%.2f\n", test.average(data));


    }


}
