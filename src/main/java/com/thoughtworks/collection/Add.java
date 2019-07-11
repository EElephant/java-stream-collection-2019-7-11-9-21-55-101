package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if(leftBorder>rightBorder){
            int num;
            num = leftBorder;
            leftBorder = rightBorder;
            rightBorder = num;
        }
        for (int i=leftBorder;i<=rightBorder;i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().mapToInt(item -> item*3+2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map(item -> item%2==0?item:(item*3+2)).collect(Collectors.toList());
    }


    public double getAverageOfEven(List<Integer> arrayList) {

        return arrayList.stream().filter(item -> item%2==0).mapToDouble(item -> item).average().getAsDouble();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        return arrayList.stream().filter(item -> item%2 == 0).distinct().collect(Collectors.toList());
    }


}
