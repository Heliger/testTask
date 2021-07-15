package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public float max(ArrayList<Integer> data) {
        int max = data.get(0);
        for(int i = 1; i < data.size(); i++){
            if (data.get(i) > max) max = data.get(i);
        }
        return max;
    }

    public float min(ArrayList<Integer> data){
        int min = data.get(0);
        for(int i = 1; i < data.size(); i++){
            if (data.get(i) < min) min = data.get(i);
        }
        return min;
    }

    public float average(ArrayList<Integer> data) {
        int average_value = 0;
        for (int i : data) average_value += i;
        return ((float) average_value)/data.size();
    }

    public float percentile(ArrayList<Integer> data) {
        Collections.sort(data);
        float real_index = (data.size() - 1) * 0.9f + 1f;
        int index = (int) real_index;
        float frac = real_index - index;
        return data.get(index - 1) + frac * (data.get(index) - data.get(
                index - 1));
    }

    public float mediana(ArrayList<Integer> data){
        Collections.sort(data);
        if (data.size() % 2 == 0) return (data.get((data.size() - 1)/2) +
                data.get((data.size() + 1)/2)) / 2.0f;
        else return data.get(data.size() / 2);
    }
}
