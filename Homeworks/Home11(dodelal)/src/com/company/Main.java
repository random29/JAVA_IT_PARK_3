package com.company;

import com.company.Lists.ArrayList;
import  com.company.Lists.LinkedList;
import com.company.Lists.List;
import com.company.Lists.Iterator;

import java.io.IOException;



public class Main{


    public static void main(String[] args) throws IOException {
        LinkedList list = new LinkedList();
        ArrayList massive = new ArrayList<LinkedList<String>>();
        DataReader reader = new DataReader("names.txt");
        DataReader numbersReader = new DataReader("names.txt");
        for (int i = 0; i < 10000; i++) {
            String word = reader.readString();
            int number = numbersReader.readInteger();
            LinkedList temp = new LinkedList(word);
            massive.getByIndex(number).addToBegin(word);
        }
        massive.printAllElements();
}
}