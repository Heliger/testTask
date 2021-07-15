package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        float[] data = new float[16];
        File dir = new File(args[0]);

        if (dir.isDirectory()) {
            for (File file : dir.listFiles()){
                Scanner scanner = new Scanner(file);
                int i = 0;
                while (scanner.hasNextLine()) {
                    data[i] += Float.parseFloat(scanner.nextLine());
                    i++;
                }
                scanner.close();
            }
        }

        float max = data[0];
        int indexMax = 0;
        for(int i = 1; i < data.length; i++){
            if (data[i] > max) {
                max = data[i];
                indexMax = i;
            }
        }
        System.out.println(max);
        System.out.println(indexMax + 1);
    }
}
