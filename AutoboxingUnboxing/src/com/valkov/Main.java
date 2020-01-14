package com.valkov;

import java.util.ArrayList;
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Rosen");

        //ArrayList<int> intArrayList=new ArrayList<int>(); -does not work because arraylist does not implement primitive types(String is actually a class and not a primitive type)
        ArrayList<IntClass> intClassArrayList=new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer=new Integer(44);
        Double doubleValue=new Double(4.32);
        ArrayList<Integer> intArrayList=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            intArrayList.add(Integer.valueOf(i));//takes the primitive value of i and converts it to the Integer class(Autoboxing)
        }
        for(int i=0;i<10;i++){
            System.out.println(i+"--->"+intArrayList.get(i).intValue());//intValue converts it to a primitive type from the Integer class
        }
        Integer myIntValue=10;//Integer.valueOf(10);
        int myInt=myIntValue;//myIntValue.intValue();
        ArrayList<Double> myDoubleList=new ArrayList<Double>();
        for(double dbl=0;dbl<=10;dbl+=0.5){
            myDoubleList.add(Double.valueOf(dbl));

        }
        for(int i=0;i<=10;i++){
            
        }
    }
}