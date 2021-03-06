package com.company;

import com.company.Lists.ArrayList;
import  com.company.Lists.LinkedList;
import com.company.Lists.List;
import com.company.Lists.Iterator;

import java.io.IOException;



public class Main{

    public static void printList(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main(String[] args) throws IOException {
       LinkedList massive[] = new LinkedList[100];
        DataReader reader = new DataReader("names.txt");
        DataReader numbersReader = new DataReader("names.txt");
        for (int i = 0; i < 100; i++) {
            massive[i] = new LinkedList();
        }
        for (int i = 0; i < 10000; i++) {
            String word = reader.readString();
            int number = numbersReader.readInteger();
            massive[number].addToBegin(word);
        }
        //massive[number].addToBegin(word);
        for (int i = 1; i < massive.length; i++) {
            System.out.println(i + " ");
            printList(massive[i]);
            System.out.println();
        }
    }
}