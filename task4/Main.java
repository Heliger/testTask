package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        List<String[]> data = new ArrayList<>();
        Set<String> timeOfEvent = new TreeSet<>();
        Map<Integer, ArrayList<String>> outputtData = new HashMap<>();
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] temp = scanner.nextLine().split(" ");
            data.add(temp);
            timeOfEvent.addAll(Arrays.asList(temp));
        }

        int currentCountOfUsers = 0;
        int countOfUsers = 0;
        for (String i : timeOfEvent) {
            for(String[] temp : data) {
                if (i.equals(temp[0])) {
                    countOfUsers++;
                }
                if (i.equals(temp[1])) {
                    countOfUsers--;
                }
            }
            if (currentCountOfUsers != countOfUsers) {
                if (!outputtData.containsKey(countOfUsers)){
                    outputtData.put(countOfUsers,
                            new ArrayList<>());
                }
                outputtData.get(countOfUsers).add(i);
                if (outputtData.containsKey(currentCountOfUsers)){
                    outputtData.get(currentCountOfUsers).add(i);
                }
                currentCountOfUsers = countOfUsers;
            }
        }
        int max = 0;
        for (int i : outputtData.keySet()) {
            if (i > max) max = i;
        }

        for (int i = 0; i <= outputtData.get(max).size()/2; i += 2) {
            System.out.print(outputtData.get(max).get(i) + " ");
            System.out.print(outputtData.get(max).get(i + 1) + "\n");
        }
    }
}
