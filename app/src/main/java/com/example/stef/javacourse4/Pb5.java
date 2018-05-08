package com.example.stef.javacourse4;

import java.util.ArrayList;

public class Pb5 {
    public static void main(String [] args){
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(6);
        integerArrayList.add(45);
        integerArrayList.add(4);
        integerArrayList.add(23);
        integerArrayList.add(16);
        integerArrayList.add(8);
        maxInRange(integerArrayList,2,10);

    }

    static void maxInRange(ArrayList<Integer> arrayOfIntegers , int lowIndex, int highIndex){
        int max=0;
        int l=0;
        if(highIndex>arrayOfIntegers.size()){
            l=arrayOfIntegers.size();
        }
        else{
            l=highIndex;
        }
        for(int i=lowIndex;i<l;i++){
            if(max<arrayOfIntegers.get(i)){
                max=arrayOfIntegers.get(i);
            }

        }

        System.out.println("Maximul este:"+max);
    }
}
