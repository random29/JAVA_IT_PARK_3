package com.company.Lists;

public class ArrayList<T> {
    //    private static final int MAX_SIZE = 10;
    private int MAX_SIZE = 100;
    private LinkedList<T> elements[];
    private int count;

    public ArrayList() {
        this.elements = new LinkedList[MAX_SIZE];
        for (int i = 0; i < 100; i++) {
            elements[i] = new LinkedList<T>();
        }
        count = 0;
    }

    public void printAllElements() {
        for (int i = 1; i < MAX_SIZE; i++) {
            System.out.println(i + " :");
            elements[i].printAllNodes();
        }
    }

    public LinkedList<T> getByIndex(int index) {
        return elements[index];
    }


    public void deleteByIndex(int index) {
        if (index >= count)
            return;
        if (index == count - 1) {
            count--;
            return;
        }
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
        return;
    }


    public int size() {
        return count;
    }


    public void addToEnd(LinkedList element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
        } else {
            System.err.println("Error, try again");
        }
    }


    public Iterator iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator {

        private int current;

        public ArrayListIterator() {
            current = 0;
        }

        @Override
        public Object next() {
            Object element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}